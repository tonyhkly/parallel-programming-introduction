import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyDetailsPageTest {

    @Test
    void testShowPropertyDetailsPageForFirstProperty() {
        PropertyDetailsPage propertyDetailsPage = new PropertyDetailsPage();

        propertyDetailsPage.showPropertyDetailsPageForFirstProperty();
    }
}
