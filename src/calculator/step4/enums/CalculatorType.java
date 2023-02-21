package calculator.step4.enums;

import calculator.step4.Calculator;
import calculator.step4.cal.CalculatorA;
import calculator.step4.cal.CalculatorB;
import calculator.step4.cal.CalculatorC;

public enum CalculatorType {
    ATYPE("A", new CalculatorA("A", new String[]{"+", "-", "*", "/"})),
    BTYPE("B",new CalculatorB("B", new String[]{"*", "/"})),
    CTYPE("C", new CalculatorC("C", new String[]{"+", "-", "*", "/", "%"}));

    private String type;
    private Calculator calculator;

    public String getType() {
        return type;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    CalculatorType(String type, Calculator calculator) {
        this.type = type;
        this.calculator = calculator;
    }
}
