public class MortgageCalculator {

    public Long getMortgagePrice(Long propertyPrice) {
        calculateMortgage();

        return Math.round(propertyPrice * 1.3);
    }

    private void calculateMortgage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
