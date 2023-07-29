package ru.geekbrains.calculator;

public final class Calculator implements Calculable {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public Calculable division(int arg) {
        try {
            primaryArg /= arg;
            return this;
        } catch (java.lang.ArithmeticException e){
            System.out.println("Делить на ноль нельзя!");
            return null;
        }
    }

    @Override
    public Calculable subtraction(int arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
