package IntrodutionToOOP.Lab4;
import IntrodutionToOOP.Lab4.SciCalculator;

public class CalcDriver {
    public static void main(String[] args) {
    SciCalculator Calc = new SciCalculator(2, 20);
    int n = 5;
    double x = Calc.exponent(n);
    System.out.println(x);
    System.out.println(Calc.calculateLn(x));
    }
}
