package calculator.step3.change1;

public abstract class AbstractCalculator2 {
    final int WIDTH = 30;
    final int HEIGHT = 30;
    boolean power = false;
    int num1;
    int num2;
    String operator;

    abstract double operate(int num1, String operator, int num2);

    void powerOnOff() {
        power = !power;
        // 확인용
        System.out.println("power = " + power);
    }

    void display(int num1, String operator, int num2, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
        if (result == -99999) {
            System.out.println("Error");
        } else {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
