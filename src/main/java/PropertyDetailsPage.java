import googlemaps.GoogleMapsDataFetcher;
import property.Property;
import property.PropertyDataRepository;

import java.time.LocalDateTime;

public class PropertyDetailsPage {

    //completeable ftures examples
    public void showPropertyDetailsPageForFirstProperty() {
        System.out.println(LocalDateTime.now() + ": Start Time");
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        GoogleMapsDataFetcher googleMapsDataFetcher = new GoogleMapsDataFetcher();
        PropertyDataRepository propertyDataRepository = new PropertyDataRepository();

        System.out.println(LocalDateTime.now() + ": Get detailed property");
        Property detailedProperty = propertyDataRepository.getFullDetailsOfPropertyById(1234L);

        System.out.println(LocalDateTime.now() + ": Get mortgage price properties");
        mortgageCalculator.getMortgagePrice(detailedProperty.getId());

        System.out.println(LocalDateTime.now() + ": Get google map data");
        googleMapsDataFetcher.getGoogleMapData(detailedProperty.getAddress());

        System.out.println(LocalDateTime.now() + ": End Time");
    }

    //parallel stream example


}
