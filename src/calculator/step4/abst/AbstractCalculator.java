package calculator.step4.abst;


import calculator.step4.Calculator;
import calculator.step4.enums.OperationType;

public abstract class AbstractCalculator implements Calculator {
    final int WIDTH = 30;
    final int HEIGHT = 30;
    boolean power = false;
    String type;
    String[] operators;

    protected AbstractCalculator(String type, String[] operators) {
        this.type = type;
        this.operators = operators;
    }

    public void run(int num1, String operator, int num2) {
        boolean checkOperator = false;
        for (String s : operators) {
            if(s.equals(operator)) {
                checkOperator = !checkOperator;
            }
        }
        if(!checkOperator){
            System.out.println("Operator Error");
            return;
        }

        AbstractOperation operation = null;
        for (OperationType value : OperationType.values()) {
            if(value.getOperator().equals(operator)){
                operation = value.getOperation();
            }
        }
        if(operation != null) {
            display(num1, operator, num2, operation.operate(num1, num2));
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void powerOnOff() {
        power = !power;
        // 확인용
        System.out.println("power = " + power);
    }

    protected void display(int num1, String operator, int num2, double result) {
        if (result == -99999) {
            System.out.println("Error");
        } else {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
