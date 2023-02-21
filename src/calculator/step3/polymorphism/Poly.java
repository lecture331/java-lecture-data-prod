package calculator.step3.polymorphism;


import calculator.step3.change2.AbstractCalculator;
import calculator.step3.change2.CommonFunction;
import calculator.step3.change2.SwitchingFunction;

public class Poly {
    void calculatorTestCommonFunction(CommonFunction calculator) {
        calculator.operate(100, "*", 5);
        calculator.display(100, "-", 5, 95);
        calculator.powerOnOff();
    }

    void calculatorTestSwitching(SwitchingFunction calculator) {
        calculator.switchingNumber();
    }

    void calculatorTestAbstract(AbstractCalculator calculator) {
        calculator.operate(100, "%", 5);
        calculator.display(100, "+", 5, 105);
        calculator.powerOnOff();
    }
}


