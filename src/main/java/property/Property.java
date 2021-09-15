package property;

import java.util.Objects;

public class Property {

    private long id;
    private long price;
    private String address;

    public Property(long id, long price, String address) {
        this.id = id;
        this.price = price;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return id == property.id && price == property.price && Objects.equals(address, property.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, address);
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }
}
