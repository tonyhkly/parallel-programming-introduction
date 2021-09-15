package property;

import java.util.Objects;

public class FullPropertyDetails {
    private Property property;
    private String googleMapData;
    private Long mortgagePrice;
    private String estateAgentDetails;

    public FullPropertyDetails(Property property, String googleMapData, Long mortgagePrice, String estateAgentDetails) {
        this.property = property;
        this.googleMapData = googleMapData;
        this.mortgagePrice = mortgagePrice;
        this.estateAgentDetails = estateAgentDetails;
    }

    public Property getProperty() {
        return property;
    }

    public String getGoogleMapData() {
        return googleMapData;
    }

    public Long getMortgagePrice() {
        return mortgagePrice;
    }

    public String getEstateAgentDetails() {
        return estateAgentDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullPropertyDetails that = (FullPropertyDetails) o;
        return Objects.equals(property, that.property) && Objects.equals(googleMapData, that.googleMapData) && Objects.equals(mortgagePrice, that.mortgagePrice) && Objects.equals(estateAgentDetails, that.estateAgentDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(property, googleMapData, mortgagePrice, estateAgentDetails);
    }

    @Override
    public String toString() {
        return "FullPropertyDetails{" +
                "property=" + property +
                ", googleMapData='" + googleMapData + '\'' +
                ", mortgagePrice=" + mortgagePrice +
                ", estateAgentDetails='" + estateAgentDetails + '\'' +
                '}';
    }
}
