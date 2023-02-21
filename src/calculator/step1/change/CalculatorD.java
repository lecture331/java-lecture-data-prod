package calculator.step1.change;

public class CalculatorD {
    final int width;
    final int height;

    CalculatorD() {
        width = 30;
        height = 30;
    }

    void display(int num1, String operator, int num2, double result){
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    double operate(int num1, String operator, int num2) {
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
