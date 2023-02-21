package calculator.step4;

import calculator.step4.enums.CalculatorType;

public class CalculatorFactory extends Factory {

    private String type;

    public CalculatorFactory(String type) {
        this.type = type;
    }

    @Override
    protected Calculator createCalculator() {
        for (CalculatorType value : CalculatorType.values()) {
            if (value.getType().equals(type)) {
                return value.getCalculator();
            }
        }
        return null;
    }
}
