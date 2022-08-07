package com.company;

public class ConstraintChek {

    public static boolean numbersInRangeCheck(int firstDigit, int secondDigit) {
        return (firstDigit < 1 || firstDigit > 10) || (secondDigit < 1 || secondDigit > 10);
    }

    public static boolean inputElementsNumberCheck(String[] inputExpression) {
        return inputExpression.length != 3;
    }
    public static boolean inputElementsSameTypeCheck(String firstDigit, String secondDigit) {
        return !(Character.isDigit(firstDigit.charAt(0)) && Character.isDigit(secondDigit.charAt(0)) ||
                (!Character.isDigit(firstDigit.charAt(0)) && !Character.isDigit(secondDigit.charAt(0))));

    }
}
