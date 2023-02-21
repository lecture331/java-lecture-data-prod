package calculator.step3.polymorphism;

import calculator.step3.change2.*;

public class Factory {
    public static void main(String[] args) {
        AbstractCalculator calculator;

        calculator = new CalculatorA();
        calculator.operate(100, "/", 5);
        calculator.display(100, "/", 5, 20);
        calculator.powerOnOff();

        System.out.println("switching");
//        calculator.switchingNumber(); // Error
//        SwitchingFunction function2 = new CalculatorB(); //  Error

        SwitchingFunction swiFunc = new CalculatorA(30, "*", 50);
        swiFunc.switchingNumber();


        Poly poly = new Poly();
        poly.calculatorTestCommonFunction(new CalculatorB());
        System.out.println();
        poly.calculatorTestSwitching(new CalculatorA(30, "*", 50));
        System.out.println();
        poly.calculatorTestAbstract(new CalculatorC());

    }
}
