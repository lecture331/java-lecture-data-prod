package calculator.step1;

public class Factory {
    public static void main(String[] args) {
        CalculatorA calculatorA = new CalculatorA();
        calculatorA.operate(100, "*", 5);
        calculatorA.operate(100, "/", 3);
        calculatorA.display(100, "-", 5, 95);
        System.out.println();

        CalculatorB calculatorB = new CalculatorB();
        calculatorB.operate(100, "*", 2);
        calculatorB.operate(100, "-", 3);
        calculatorB.display(100, "/", 5, 20);
        System.out.println();

        CalculatorC calculatorC = new CalculatorC();
        calculatorC.operate(100, "*", 3);
        calculatorC.operate(100, "%", 5);
        calculatorC.display(100, "%", 5, 0);
    }
}

