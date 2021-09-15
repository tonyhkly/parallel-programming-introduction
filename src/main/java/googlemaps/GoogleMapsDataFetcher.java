package googlemaps;

public class GoogleMapsDataFetcher {

    public String getGoogleMapData(String postcode) {
        callGoogleMaps();

        return "Returned google map data for property " + postcode;
    }

    private void callGoogleMaps() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
