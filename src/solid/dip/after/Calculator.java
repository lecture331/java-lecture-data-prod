package solid.dip.after;

public class Calculator {

    // 추상화된 부모 클래스를 포함관계로 사용한다.
    private AbstractOperation operation;

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다.
    public int calculate(int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}
