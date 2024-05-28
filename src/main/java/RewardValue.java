public class RewardValue {
    private double cash;
    private int miles;

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = (int) (cash / 0.0035f);
    }

    public RewardValue(int miles){
        this.cash = miles * 0.0035f;
        this.miles = miles;
    }

    public double getCashValue(){
        return this.cash;
    }

    public int getMilesValue() {
        return this.miles;
    }
    
}
