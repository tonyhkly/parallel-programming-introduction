import googlemaps.GoogleMapsDataFetcher;
import property.Property;
import property.PropertyDataRepository;

import java.util.List;

public class PropertyDetailsPage {


    //completeable ftures examples
    public void showPropertyDetailsPage() {
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        GoogleMapsDataFetcher googleMapsDataFetcher = new GoogleMapsDataFetcher();
        PropertyDataRepository propertyDataRepository = new PropertyDataRepository();

        List<Property> properties = propertyDataRepository.getAll();

        Property detailedProperty = propertyDataRepository.getFullDetailsOfPropertyById(properties.get(0).getId());

        mortgageCalculator.getMortgagePrice(12346L);
        googleMapsDataFetcher.getGoogleMapData("SW16 4QF");
    }


    //parallel stream example
}
