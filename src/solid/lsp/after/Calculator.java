package solid.lsp.after;

public class Calculator {
    // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다.
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        // instanceof 로 DivideOperation 를 따로 구분하지 않고 처리 가능
        if(operation.isInvalid(firstNumber, secondNumber)){
            return -99999;
        }
        return operation.operate(firstNumber, secondNumber);
    }
}
