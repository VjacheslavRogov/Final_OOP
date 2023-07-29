package ru.geekbrains.calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable division(int arg);
    Calculable subtraction(int arg);
    int getResult();
}
