package calculator.step3.change1;

public class CalculatorD extends AbstractCalculator{
    @Override
    double operate(int num1, String operator, int num2) {
        this.num1 = num1;
        super.num2 = num2;
        this.operator = operator;
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
