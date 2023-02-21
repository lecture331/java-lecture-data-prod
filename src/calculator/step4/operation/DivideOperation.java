package calculator.step4.operation;

import calculator.step4.abst.AbstractOperation;

public class DivideOperation extends AbstractOperation {
    @Override
    protected double operate(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return -99999;
        }
    }
}
