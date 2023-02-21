package calculator.step3.change2;

public class CalculatorC extends AbstractCalculator implements SwitchingFunction{
    public double operate(int num1, String operator, int num2) {
        setOperateVar(num1, operator, num2);
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
            case "%":
                result = num1 % num2;
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

