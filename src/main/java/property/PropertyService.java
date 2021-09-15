package property;

import java.util.Collections;
import java.util.List;

public class PropertyService {

    private final PropertyDataRepository propertyDataRepository;

    public PropertyService(PropertyDataRepository propertyDataRepository) {
        this.propertyDataRepository = propertyDataRepository;
    }

    public List<Property> getProperties(int minPrice, int maxPrice) {
        return Collections.emptyList();
    }
}
