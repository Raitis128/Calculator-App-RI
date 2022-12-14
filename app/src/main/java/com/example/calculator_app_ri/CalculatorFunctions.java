package com.example.calculator_app_ri;

public class CalculatorFunctions {

    public static boolean zeroIsFirst(String number) {
        if (number.equals("")){
            return true;
        }
        if (number.charAt(0) == '0') {
            return true;
        }else {
            return false;
        }
    }

    public static boolean numberIsZero(String number) {
        if (number.equals("0") || number.equals("")){
            return true;
        }else {
            return false;
        }

    }

    public static boolean dotIsPresent(String number) {
        if (number.indexOf(".") == -1 ){
            return false;
        }else {
            return true;
        }
    }

    public static boolean minusIsPresent(String number) {
        if (number.charAt(0) == '-') {
            return true;
        }else {
            return false;
        }
    }
}
