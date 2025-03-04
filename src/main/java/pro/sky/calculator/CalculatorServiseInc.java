package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiseInc implements CalculatorServise {
    public String HelloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String Sum(int num1, int num2) {
        int answer = num1 + num2;
        return num1 + " + " + num2 + " = " + answer;
    }

    public String subtraction(int num1, int num2) {
        int answer = num1 - num2;
        return num1 + " - " + num2 + " = " + answer;
    }

    public String multiply(int num1, int num2) {
        int answer = num1 * num2;
        return num1 + " * " + num2 + " = " + answer;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        double nom1 = num1;
        double nom2 = num2;
        double answer = nom1 / nom2;
        return num1 + " / " + num2 + " = " + answer;
    }

}


