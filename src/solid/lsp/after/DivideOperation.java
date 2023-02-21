package solid.lsp.after;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public boolean isInvalid(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return true;
        } else {
            return false;
        }
    }
}
