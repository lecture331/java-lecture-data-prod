package calculator.step2.change;

public abstract class AbstractCalculator {
    final int WIDTH = 30;
    final int HEIGHT = 30;

    abstract double operate(int num1, String operator, int num2);

    void display(int num1, String operator, int num2, double result) {
        if (result == -99999) {
            System.out.println("Error");
        } else {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
