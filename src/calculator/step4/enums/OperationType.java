package calculator.step4.enums;

import calculator.step4.abst.AbstractOperation;
import calculator.step4.operation.*;

public enum OperationType {
    ADD("+", new AddOperation()),
    SUB("-",new SubstractOperation()),
    MUL("*", new MultiplyOperation()),
    DIV("/", new DivideOperation()),
    MOD("%", new ModOperation());

    private String operator;
    private AbstractOperation operation;

    public String getOperator() {
        return operator;
    }

    public AbstractOperation getOperation() {
        return operation;
    }

    OperationType(String operator, AbstractOperation operation) {
        this.operator = operator;
        this.operation = operation;
    }
}

