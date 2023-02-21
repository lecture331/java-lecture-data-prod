package solid.lsp.after;

public abstract class AbstractOperation {
    public abstract int operate(int firstNumber, int secondNumber);
    public boolean isInvalid(int firstNumber, int secondNumber) {
        return false;
    }
}
