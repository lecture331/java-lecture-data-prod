package solid.ocp.after;

public class Client {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int firNum = 140;
        int secNum = 60;

        calculator.setOperation(new AddOperation());
        int answer = calculator.calculate(firNum, secNum);
        System.out.println(" + answer = " + answer);

        calculator.setOperation(new SubstractOperation());
        answer = calculator.calculate(firNum, secNum);
        System.out.println(" - answer = " + answer);

        calculator.setOperation(new MultiplyOperation());
        answer = calculator.calculate(firNum, secNum);
        System.out.println(" * answer = " + answer);

        calculator.setOperation(new DivideOperation());
        answer = calculator.calculate(firNum, secNum);
        System.out.println(" / answer = " + answer);
    }
}
