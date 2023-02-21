package calculator.step4.operation;


import calculator.step4.abst.AbstractOperation;

public class SubstractOperation extends AbstractOperation {
    @Override
    protected double operate(int num1, int num2) {
        return num1 - num2;
    }
}
