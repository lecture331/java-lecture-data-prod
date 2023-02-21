package calculator.step1;

public class CalculatorA {
    final int WIDTH;
    final int HEIGHT;

    CalculatorA() {
        WIDTH = 30;
        HEIGHT = 30;
    }

    void display(int num1, String operator, int num2, double result){
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

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
