package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }


    public int operator(int a, int b, char opt){
        switch (opt){
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            case '^':
                return pow(a, b);
            default:
                return -1;
        }
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int pow(int a, int b) {
        return (int)Math.pow(a, b);
    }
}