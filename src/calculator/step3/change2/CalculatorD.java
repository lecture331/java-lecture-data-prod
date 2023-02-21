package calculator.step3.change2;

public class CalculatorD extends AbstractCalculator {
    @Override
    public double operate(int num1, String operator, int num2) {
        setOperateVar(num1, operator, num2);
        double result = -99999;
        switch (operator) {
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
}