/**
 * Created by bal_calynch on 1/11/2016.
 */
import java.util.Scanner; // import of Scanner

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        boolean NotDone = true;

        //Fraction leftSide = new Fraction("1"); //need to figure out how to take in the Scanner number
        //Fraction rightSide = new Fraction("3"); //need to put something in paraenthesis
        //need to figure out how to deal with negative numbers

        //System.out.println(leftSide.getNumerator());
       // System.out.println(leftSide.getDenominator());
        //System.out.println(leftSide.toString()); //prints the fraction

        while (NotDone) {

            System.out.println("Input or quit:");
            String equation = in.nextLine(); //takes in the equation

            Fraction leftSide = new Fraction(equation.substring(0, equation.indexOf(" ")));
            Fraction rightSide = new Fraction(equation.substring(equation.lastIndexOf(" ")+1, equation.length()));
            String operation = (equation.substring(equation.indexOf(" ")+1, equation.lastIndexOf(" ")));

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

            // if (equation == "+") {

              /*  if (equation.contains("+")){
                    int result = leftSide.add(rightSide);
                    //return result;
                }
                /*



                if (equation.contains("*")) {
                    int result = leftSide.multiply(rightSide);
                }

                if (equation.contains("/")) {
                    int result = leftSide.divide(rightSide);
                }




                //String equation = in.nextLine(); //takes in the whole equation
                // String leftSide = in.next(); //creates String as Scanner
                // String rightSide = in.next(); //right side String as Scanner
                // String operation = "+" || "-" || "*" || "/";

                /*
                if (equation == "+") {
                    private Main add(Fraction leftSide, Fraction rightSide){
                        int answer = leftSide + rightSide;


                        //( (x/z) +(y/z) = ( (x+y)/z )
                    }


                    Fraction result = leftSide.add(rightSide);
                }
                if (equation == "-") {
                    Fraction result = leftSide.subtract(rightSide);
                }
                if (equation == "*") {
                    Fraction result = leftSide.multiply(rightSide);
                }
                if (equation == "/") {
                    Fraction result = leftSide.divide(rightSide);
                }
                System.out.println(result);


            public Fraction add(Fraction leftSide, Fraction rightSide){

            }

            public Fraction subtract(Fraction leftSide, Fraction rightSide)
            {


            }

            public Fraction multiply (Fraction leftSide, Fraction rightSide)
            {


            }

            public Fraction divide (Fraction leftSide, Fraction rightSide)
            {


            }

        */

            //int a = equation.indexOf(" "); //gets the first number before the space

        }


    }
}



//}
