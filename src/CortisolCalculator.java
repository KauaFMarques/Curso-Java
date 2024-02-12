public class CortisolCalculator {
    public static void main(String[] args){
        double cortisol=3;
        if (cortisol >= 6.0 && cortisol <= 18.4) {
            System.out.println("Cortisol normal");
        } else if (cortisol > 18.4) {
            System.out.println("Cortisol alto");
        } else {
            System.out.println("Cortisol baixo");
        }
        
    }
}
