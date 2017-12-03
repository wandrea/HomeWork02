package hu.helixlab;

public class Main {

    public static void main(String[] args) {
        CalculatorService cs = new CalculatorService();

        System.out.println(cs.isItEven(25));
        System.out.println(cs.calculate(5, 6, '+'));

        cs.generateRandomNumber();

        cs.generateAndCompareRandomNumbers();
        System.out.println();
        CalculatorHelper ch = new CalculatorHelper();
        ch.doCalculate();
    }
}
