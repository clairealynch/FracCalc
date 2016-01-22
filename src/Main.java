/**
 * Created by bal_calynch on 1/11/2016.
 */
import java.util.Scanner; // import of Scanner

public class Main {

    public static void main(String[] args) {

        Fraction frac = new Fraction("-1_1/3");
        Fraction two = new Fraction("-6/8");
        String result = frac.add(two);
        System.out.println(result);

       /* Scanner in = new Scanner(System.in);
        boolean NotDone = true;

      while (NotDone) {

            System.out.println("Input or quit:");
            String equation = in.nextLine(); //takes in the equation

            Fraction leftSide = new Fraction(equation.substring(0, equation.indexOf(" ")));
            Fraction rightSide = new Fraction(equation.substring(equation.lastIndexOf(" ") + 1, equation.length()));
            String operation = (equation.substring(equation.indexOf(" ") + 1, equation.lastIndexOf(" ")));

            if (equation.contains("quit")) {
                in.close();
            }
            if (operation.contains("+")) {
                String result = leftSide.add(rightSide);
                System.out.println(result);
            }
            if (operation.contains("-")) {
                String result = leftSide.subtract(rightSide);
                System.out.println(result);
            }
            if (operation.contains("*")) {
                String result = leftSide.multiply(rightSide);
                System.out.println(result);
            }
            if (operation.contains("/")) {
                String result = leftSide.divide(rightSide);
                System.out.println(result);
            }
        } */
    }
}


