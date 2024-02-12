public class TimeCompoundInterestCalculator {
    public static void main(String[] args){
        double accumulatedValue=10000;
        double monthlyInterestRale=0.8;
        int periodMonth=12;

        for(int month=1; month<=periodMonth; month++){
            accumulatedValue += accumulatedValue * monthlyInterestRale/100;
            System.out.println("Month " + month + " = " + accumulatedValue);
        }
    }
}
