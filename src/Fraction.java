/**
 * Created by bal_calynch on 1/11/2016.
 */
public class Fraction {

    private int numerator; //numerator instance variable
    private int denominator; //denominator instance variable

    public Fraction(String frac) { //constructor

        if (frac.contains("_")) { //this takes the mixed number and converts to improper fraction

            String aNumber = frac.substring(0, frac.indexOf("_"));
            int numberA = Integer.parseInt(aNumber); //gets the number before _
            String bNumber = frac.substring(frac.indexOf("_") + 1, frac.indexOf("/")); //gets the value starting from position 0 to the "_"
            int numberB = Integer.parseInt(bNumber); //converts to an int value
            String cNumber = frac.substring(frac.indexOf("/") + 1, frac.length()); //should get the denominator value
            int numberC = Integer.parseInt(cNumber);

            if (aNumber.contains("-")) { //at this point, its not changing bnumber to a negative value
                bNumber = (- + (bNumber)); //might need to delete this part, but need to figure this out
            }
            numerator = ((numberC * numberA) + numberB); //changes to improper fraction
            denominator = numberC; //the denominator

        } else if (frac.contains("/")) {
            String aNumerator = frac.substring(0, frac.indexOf("/"));
            String aDenominator = frac.substring(frac.indexOf("/") + 1);

            numerator = Integer.parseInt(aNumerator); //String numerator to an int
            denominator = Integer.parseInt(aDenominator); //String denominator to an int
        } else { //if number is a whole number
            numerator = Integer.parseInt(frac);
            denominator = 1;
        }

    }

    public int getNumerator() { //gets the numerator
        return numerator;
    }

    public int getDenominator() { //gets the denominator
        return denominator;
    }

    public String toString() {
        return (numerator + "/" + denominator);
    }

    public String add(Fraction frac) { //add method
        int numerator2 = frac.getNumerator();
        int denominator2 = frac.getDenominator();
        if (denominator != denominator2) { //find lowest common denominator
            int newNum1 = (numerator * denominator2);
            int newNum2 = (numerator2 * denominator);
            numerator = newNum1 + newNum2;
            denominator = denominator2 * denominator;
            return simplify();
        } else {
            numerator = numerator + numerator2;
            return simplify();
        }
    }
    public String subtract(Fraction frac){
        int numerator2= frac.getNumerator();
        int denominator2= frac.getDenominator();
        if (denominator != denominator2) { //find lowest common denominator
            denominator = denominator2 * denominator;
            int newNum1 = (numerator * denominator2);
            int newNum2 = (numerator2 * denominator);
            numerator = newNum1 - newNum2;
            return simplify();
        } else {
            numerator = numerator - numerator2;
            return (simplify());
        }
    }
    public String multiply(Fraction frac){
        int numerator2= frac.getNumerator();
        int denominator2= frac.getDenominator();
        numerator = (numerator*numerator2);
        denominator = (denominator*denominator2);
        return simplify();
    }
    public String divide(Fraction frac){
        int numerator2= frac.getNumerator();
        int denominator2= frac.getDenominator();
        numerator = (numerator/numerator2);
        denominator = (denominator/denominator2);
        return simplify();
    }
    public int gcd(int numerator, int denominator){
        int a = Math.max(Math.abs(numerator), Math.abs(denominator)); //know which one is larger
        for (int i = a; i >=1; i--){ //for loop-to find gcd
            if ((numerator%i == 0) && (denominator%i == 0)){
                return i;
            }
        }
        return 1;
    }
    public String simplify(){

        //see if numerator and denom have common factor
        //math it
        //return num over denom

        int simp = gcd(numerator, denominator);
        numerator = (numerator/simp);
        denominator = (denominator/simp);
        if (denominator == 1){
            return (numerator + "");
        }
        if (numerator > denominator){
            int first = (numerator/denominator);
            numerator = (numerator%denominator);
            return (first + "_" + numerator + "/" + denominator);
        }
        else {
            return (numerator + "/" + denominator);
        }

    }

}





