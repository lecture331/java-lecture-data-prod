package solid.ocp.after;

public class DivideOperation extends AbstractOperation{
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
