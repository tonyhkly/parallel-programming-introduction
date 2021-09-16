import estateagentdetails.EstateAgentDetailsFetcher;
import googlemaps.GoogleMapsDataFetcher;
import property.FullPropertyDetails;
import property.Property;
import property.PropertyDataRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

;

public class PropertyDetailsPage {

    private final MortgageCalculator mortgageCalculator;
    private final GoogleMapsDataFetcher googleMapsDataFetcher;
    private PropertyDataRepository propertyDataRepository;
    private final EstateAgentDetailsFetcher estateAgentDetailsFetcher;

    public PropertyDetailsPage() {
        this.estateAgentDetailsFetcher = new EstateAgentDetailsFetcher();
        this.mortgageCalculator = new MortgageCalculator();
        this.googleMapsDataFetcher = new GoogleMapsDataFetcher();
        this.propertyDataRepository = new PropertyDataRepository();
    }

    //CompletableFuture example
    public FullPropertyDetails showPropertyDetailsPageForFirstProperty(Long propertyId) {
        System.out.println(LocalDateTime.now() + ": ***** Start Time *****");

        System.out.println(LocalDateTime.now() + ": Get detailed property");
        Property detailedProperty = propertyDataRepository.getFullDetailsOfPropertyById(propertyId);

        System.out.println(LocalDateTime.now() + ": Get mortgage price properties");
        CompletableFuture<Long> mortgagePriceFuture = CompletableFuture.supplyAsync(() -> mortgageCalculator.getMortgagePrice(detailedProperty.getId()));

        System.out.println(LocalDateTime.now() + ": Get google map data");
        CompletableFuture<String> googleMapDataFuture = CompletableFuture.supplyAsync(() -> googleMapsDataFetcher.getGoogleMapData(detailedProperty.getAddress()));

        System.out.println(LocalDateTime.now() + ": Get estate agent details");
        CompletableFuture<String> estateAgentDetailsFuture = CompletableFuture.supplyAsync(() -> estateAgentDetailsFetcher.getEsateAgentDetails());

        try {
            FullPropertyDetails fullPropertyDetails = new FullPropertyDetails(detailedProperty, googleMapDataFuture.get(), mortgagePriceFuture.get(), estateAgentDetailsFuture.get());
            System.out.println(LocalDateTime.now() + ": ***** End Time *****");

            return fullPropertyDetails;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

    //parallel stream example
    public List<FullPropertyDetails> getDetailsOfMultipleProperties(List<Long> propertyIds) {
        System.out.println(LocalDateTime.now() + ": ************* START Getting details for propertyIds *************");

        List<FullPropertyDetails> propertyDetailsList = propertyIds.stream()
                .map(this::showPropertyDetailsPageForFirstProperty)
                .parallel()
                .collect(Collectors.toList());

        System.out.println(LocalDateTime.now() + ": ************* END Getting details for propertyIds *************");

        return propertyDetailsList;
    }
}
