;import estateagentdetails.EstateAgentDetailsFetcher;
import googlemaps.GoogleMapsDataFetcher;
import property.FullPropertyDetails;
import property.Property;
import property.PropertyDataRepository;

import java.time.LocalDateTime;
import java.util.List;

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

    //completeable future example
    public FullPropertyDetails showPropertyDetailsPageForFirstProperty(Long propertyId) {
        System.out.println(LocalDateTime.now() + ": Start Time");

        System.out.println(LocalDateTime.now() + ": Get detailed property");
        Property detailedProperty = propertyDataRepository.getFullDetailsOfPropertyById(propertyId);

        System.out.println(LocalDateTime.now() + ": Get mortgage price properties");
        Long mortgagePrice = mortgageCalculator.getMortgagePrice(detailedProperty.getId());

        System.out.println(LocalDateTime.now() + ": Get google map data");
        String googleMapData = googleMapsDataFetcher.getGoogleMapData(detailedProperty.getAddress());

        System.out.println(LocalDateTime.now() + ": Get estate agent details");
        String estateAgentDetails = estateAgentDetailsFetcher.getEsateAgentDetails();

        System.out.println(LocalDateTime.now() + ": End Time");

        return new FullPropertyDetails(detailedProperty, googleMapData, mortgagePrice, estateAgentDetails);
    }

    //parallel stream example
    public List<FullPropertyDetails> getDetailsOfMultipleProperties(List<Long> propertyIds) {
        for (Long propertyId : propertyIds) {
            System.out.println(LocalDateTime.now() + ": START Getting details for property with id: " + propertyId);

            showPropertyDetailsPageForFirstProperty(propertyId);
            System.out.println(LocalDateTime.now() + ": END Getting details for property with id: " + propertyId);
        }

        return List.of();
    }
}
