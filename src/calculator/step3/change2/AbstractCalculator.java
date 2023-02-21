package calculator.step3.change2;

public abstract class AbstractCalculator implements CommonFunction {
    final int WIDTH = 30;
    final int HEIGHT = 30;
    boolean power = false;
    private int num1;
    private int num2;
    private String operator;

    public AbstractCalculator() {
    }

    public AbstractCalculator(int num1, String operator, int num2) {
        this.num1 = num1;
        this.operator = operator;
        this.num2 = num2;
    }

    public void setOperateVar(int num1, String operator, int num2) {
        this.num1 = num1;
        this.operator = operator;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void powerOnOff() {
        power = !power;
        // 확인용
        System.out.println("power = " + power);
    }

    public void display(int num1, String operator, int num2, double result) {
        if (result == -99999) {
            System.out.println("Error");
        } else {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}