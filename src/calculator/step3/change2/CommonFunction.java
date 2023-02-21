package calculator.step3.change2;

public interface CommonFunction {
    double operate(int num1, String operator, int num2);
    void powerOnOff();
    void display(int num1, String operator, int num2, double result);
}
