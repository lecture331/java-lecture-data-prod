package calculator.step4;

public abstract class Factory{

    public Calculator getInstance(){
        return createCalculator();
    }

    protected abstract Calculator createCalculator();
}

