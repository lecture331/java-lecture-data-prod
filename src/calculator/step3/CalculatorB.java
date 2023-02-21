package calculator.step3;

public class CalculatorB extends AbstractCalculator {
    double operate(int num1, String operator, int num2) {
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
        }
        display(num1, operator, num2, result);
        return result;
    }

}

