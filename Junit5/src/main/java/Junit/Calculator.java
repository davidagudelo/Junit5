package Junit;

public class Calculator {



    public int add (int a, int b) {
        return a + b;
    }

    public int subtrac (int a, int b) {
        return a - b;
    }

    public int divide (int a, int b) {
        return a / b;
    }

    public int divideByZero (int a, int b) {
        if (b == 0 ){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
