package property;

import java.util.List;

public class PropertyDataRepository {

    public List<Property> getAll() {
        return List.of(
                new Property(1114, 300000, "1 real road"),
                new Property(2335, 1200000, "3 real road"),
                new Property(3333, 305000, "6 something street"),
                new Property(4457, 700000, "10 chucky road"),
                new Property(5343, 907000, "90 cheese road"),
                new Property(6767, 300000, "66 sat road"),
                new Property(7677, 250000, "23 sandwich avenue"),
                new Property(8223, 303000, "59 mocking road"),
                new Property(967756,7300000, "100 real road"),
                new Property(107778, 807000, "19 chilli road")
        );
    }
}
