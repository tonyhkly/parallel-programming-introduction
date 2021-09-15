package googlemaps;

public class GoogleMapsDataFetcher {

    public String getGoogleMapData(String postcode) {
        try {
            Thread.sleep(2500);
            return "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2482.8855645357994!2d-0.13432458434321204!3d51.515315417945516!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761b2cd5d6a091%3A0x9be1edf045243ac0!2sSoho%20Square%2C%20London!5e0!3m2!1sen!2suk!4v1631742574111!5m2!1sen!2suk\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\"></iframe>";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "";
        }
    }
}
