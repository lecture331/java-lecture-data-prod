package calculator.step3.change1;

public class Factory {
    public static void main(String[] args) {
        CalculatorA calculatorA = new CalculatorA();
        calculatorA.operate(100, "*", 5);
        calculatorA.operate(100, "/", 3);
        calculatorA.display(100, "-", 5, 95);
        calculatorA.powerOnOff();
        System.out.println("switching");
        calculatorA.switchingNumber();
        System.out.println();

        CalculatorB calculatorB = new CalculatorB();
        calculatorB.operate(100, "*", 2);
        calculatorB.operate(100, "-", 3);
        calculatorB.display(100, "/", 5, 20);
        calculatorB.powerOnOff();
        System.out.println("switching");
        System.out.println();

        CalculatorC calculatorC = new CalculatorC();
        calculatorC.operate(100, "*", 3);
        calculatorC.operate(100, "%", 5);
        calculatorC.display(100, "%", 5, 0);
        calculatorC.powerOnOff();
        System.out.println("switching");
        calculatorC.switchingNumber();
        System.out.println();

        CalculatorD calculatorD = new CalculatorD();
        calculatorD.operate(100, "-", 3);
        calculatorD.operate(100, "%", 5);
        calculatorD.display(100, "+", 5, 105);
        calculatorD.powerOnOff();
        calculatorD.switchingNumber();
    }
}

