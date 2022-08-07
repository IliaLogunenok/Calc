package com.company;

public class CalculationProcedure {
    public static int calculate(int firstOperand, int secondOperand, String operator) {

        if (ConstraintChek.numbersInRangeCheck(firstOperand, secondOperand)) {
            throw new RuntimeException("Ошибка: Введены числа больше требуемого диапазона");
        }

        int result;

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            default:
                throw new RuntimeException("Ошибка : Оператор не корректен, должен быть: + - * /");
        }

        return result;
    }
}
