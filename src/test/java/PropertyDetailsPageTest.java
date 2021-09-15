import org.junit.jupiter.api.Test;

import java.util.List;

class PropertyDetailsPageTest {

    @Test
    void testShowPropertyDetailsPageForFirstProperty() {
        PropertyDetailsPage propertyDetailsPage = new PropertyDetailsPage();

        propertyDetailsPage.showPropertyDetailsPageForFirstProperty(123L);
    }

    @Test
    void testShowMultiplePropertyDetailsPageForFirstProperty() {
        PropertyDetailsPage propertyDetailsPage = new PropertyDetailsPage();

        List<Long> propertyIds = List.of(1L, 2L, 3L, 4L, 5L);
        propertyDetailsPage.getDetailsOfMultipleProperties(propertyIds);
    }
}
