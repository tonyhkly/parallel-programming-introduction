package estateagentdetails;

public class EstateAgentDetailsFetcher {

    public String getEsateAgentDetails() {
        try {
            Thread.sleep(2500);
            return "Lorem ipsum dolor sit amet, consectetur adipiscing";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "";
        }
    }
}
