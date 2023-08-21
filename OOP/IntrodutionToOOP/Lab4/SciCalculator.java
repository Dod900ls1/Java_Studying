package IntrodutionToOOP.Lab4;
import java.lang.IllegalArgumentException;


public class SciCalculator {

    private static int desimal;
    public static int getDesimal() {
        return desimal;
    }
    public void setDesimal(int desimal) {
        SciCalculator.desimal = desimal;
    }
    
    private static int accuracy;
    public static int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int accuracy) {
        SciCalculator.accuracy = accuracy;
    }
    
    public SciCalculator() {}

    public SciCalculator(int desimal, int accuracy) {
        setDesimal(desimal);
        setAccuracy(accuracy);
    }

    public static double roundUp(double number){
        if(getDesimal() < 0){
            throw new IllegalArgumentException("Decimal places must be greater than or equal to 0!");
        }
        double factor = Math.pow(10, getDesimal());
        return Math.ceil(number * factor) / factor;
    }

    private static double calculateE(){
        double sum = 1;
        double factorial = 1;
        for (int i = 1; i <= getAccuracy(); i++) {
            factorial *= i;
            sum += 1 / factorial;
        }

        return sum;
    }
    /**
     * @param x
     * @return
     */
    public final double exponent(double x){
        return Math.pow(calculateE(), x);
    }

    public final double calculateLn(double number) {
        return Math.log(number);
    }
        
}
