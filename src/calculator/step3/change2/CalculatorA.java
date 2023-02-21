package calculator.step3.change2;

public class CalculatorA extends AbstractCalculator implements SwitchingFunction{
    public CalculatorA() {
    }

    public CalculatorA(int num1, String operator, int num2) {
        super(num1, operator, num2);
    }
    public double operate(int num1, String operator, int num2) {
        super.setNum1(num1);
        this.setNum2(num2);
        setOperator(operator);
        double result = -99999;
        switch (operator) {
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }
        display(num1, operator, num2, result);
        return result;
    }

    @Override
    public void switchingNumber() {
        operate(super.getNum2(), this.getOperator(), getNum1());
    }
}

