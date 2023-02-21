package calculator.step4;

public class Test {
    public static void main(String[] args) {
        Factory factory = new CalculatorFactory("A");
        Calculator calculator = factory.getInstance();
        calculator.run(10, "+", 20);
        calculator.run(4, "*", 20);
        System.out.println();

        calculator = factory.getInstance();
        calculator.run(100, "*", 20);
        calculator.powerOnOff();
        System.out.println();
    }
}



