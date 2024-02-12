public class CompoundInterestGoalCalculator {
    public static void main(String[] args){
        double accumulatedValue =10000;
        double targetValue=20000;
        double rateMonthlyInterest =0.8;
        int month=0;
        
        while (accumulatedValue<=targetValue) {
            month++;
            accumulatedValue += accumulatedValue * rateMonthlyInterest/100;
            System.out.println("Month " + month + " = " + accumulatedValue);
        }
    }
}
