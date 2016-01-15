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
            int newDenom = denominator2 * denominator;
            //find lcd
            //multiply numerators by denoms (num/den + num2/den2 to num*den2/den*den2 + num2*den/den*den2)
            int newNum1 = (numerator * denominator2);
            int newNum2 = (numerator2 * denominator);
            int addedNum = newNum1 + newNum2;
            String theFrac = (addedNum + "/" + newDenom);
            return (theFrac); //do I want to return this as an int or String?- still need to simplify
            // need to return this as a String- not here maybe but somewhere
        } else {
            int addedNum = numerator + numerator2;
            String theFrac = (addedNum + "/" + denominator);
            return (theFrac); //still need to simplify
        }
    }
    public String subtract(Fraction frac){
        int numerator2= frac.getNumerator();
        int denominator2= frac.getDenominator();
        if (denominator != denominator2) { //find lowest common denominator
            int newDenom = denominator2 * denominator;
            int newNum1 = (numerator * denominator2);
            int newNum2 = (numerator2 * denominator);
            int subtractedNum = newNum1 - newNum2;
            String theFrac = (subtractedNum + "/" + newDenom);
            return (theFrac);
        } else {
            int subtractedNum = numerator - numerator2;
            String theFrac = (subtractedNum + "/" + denominator);
            return (theFrac); //still need to simplify
        }
    }
    public String multiply(Fraction frac){
        int numerator2= frac.getNumerator();
        int denominator2= frac.getDenominator();
        int newNum = (numerator*numerator2);
        int newDen = (denominator*denominator2);
        String theFrac = (newNum + "/" + newDen);
        return theFrac;
    }
    public String divide(Fraction frac){ // right now it won't work b/c the fraction has "/", works on whole nums (4/2), not on (2/4) and fracs (1/2)
        int numerator2= frac.getNumerator();
        int denominator2= frac.getDenominator();
        int newNum = (numerator/numerator2);
        int newDen = (denominator/denominator2);
        String theFrac = (newNum + "/" + newDen);
        return theFrac;
    }
    public String simplify(){

    }
        //}

        //int answer = ; //can't do this bc left and rightSide are in the Main class
        //return answer;
       /*

        public int subtract(Fraction frac) {

        }

        public int multiply(Fraction frac) {

        }

        public int divide(Fraction frac) {

        }

        public int simplify()



    /*
    String equation;//will remove this

    //also need to recognize "-" before a number as a negative value
    int a = equation.indexOf(" "); //parses the String into int a, the operation, and int b
    // String operation = equation.indexOf(a + 1); //can only use indexOf for ints?
    int b = equation.indexOf(a + 2);
    int operation = equation.indexOf(" " + 1); //shouldn't this be a String?

          /* //need to take mixed numbers and convert to improper fractions (probably use if statements)
               if (umerator > denominatorn) {
                   int num1 =          //Already have this above?

               }*/


    }





