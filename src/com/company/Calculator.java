package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        try {
            System.out.println("Калькулятор для выражений через пробел. Допускаются числа от 1 до 10 или от I до X включительно. Операции: + - * /");
            System.out.print("Введите выражение: ");

            Scanner scanner = new Scanner(System.in);
            String inputExpression = scanner.nextLine();
            String [] expression = inputExpression.split(" ");

            if (ConstraintChek.inputElementsNumberCheck(expression)) {
                throw new Exception("Ошибка: Неверное количество элементов ввода");
            }
            if (ConstraintChek.inputElementsSameTypeCheck(expression[0], expression[2])) {
                throw new Exception("Ошибка: используются одновременно разные системы счисления");
            }

            boolean inputIsRoman = !Character.isDigit(expression[0].charAt(0));
            int firstDigit = Converter.romanToArabic(expression[0]);
            int secondDigit = Converter.romanToArabic(expression[2]);
            String operator = expression[1];

            Integer calculationResult = CalculationProcedure.calculate(firstDigit, secondDigit, operator);
            String outputResult;

            if (inputIsRoman) {
                outputResult = Converter.arabicToRoman(calculationResult);
            } else {
                outputResult = calculationResult.toString();
            }

            System.out.println("Ответ = " + outputResult);

            }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
