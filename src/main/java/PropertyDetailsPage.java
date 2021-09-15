import googlemaps.GoogleMapsDataFetcher;
import property.Property;
import property.PropertyDataRepository;

import java.time.LocalDateTime;
import java.util.List;

public class PropertyDetailsPage {

    //completeable future example
    public void showPropertyDetailsPageForFirstProperty(Long propertyId) {
        System.out.println(LocalDateTime.now() + ": Start Time");
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        GoogleMapsDataFetcher googleMapsDataFetcher = new GoogleMapsDataFetcher();
        PropertyDataRepository propertyDataRepository = new PropertyDataRepository();

        System.out.println(LocalDateTime.now() + ": Get detailed property");
        Property detailedProperty = propertyDataRepository.getFullDetailsOfPropertyById(propertyId);

        System.out.println(LocalDateTime.now() + ": Get mortgage price properties");
        mortgageCalculator.getMortgagePrice(detailedProperty.getId());

        System.out.println(LocalDateTime.now() + ": Get google map data");
        googleMapsDataFetcher.getGoogleMapData(detailedProperty.getAddress());

        System.out.println(LocalDateTime.now() + ": End Time");
    }

    //parallel stream example
    public void getDetailsOfMultipleProperties(List<Long> propertyIds) {
        for (Long propertyId : propertyIds) {
            System.out.println(LocalDateTime.now() + ": START Getting details for property with id: " + propertyId);

            showPropertyDetailsPageForFirstProperty(propertyId);
            System.out.println(LocalDateTime.now() + ": END Getting details for property with id: " + propertyId);
        }
    }
}
