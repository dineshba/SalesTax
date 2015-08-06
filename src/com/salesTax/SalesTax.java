package com.salesTax;


public class SalesTax {

    public boolean calculate(String input) {
        String[] strings = input.split(" ");
        int length = strings.length;

        for (String string : strings) {
            if (string.equals("imported"))
                return true;
        }
        return false;
    }

    public double getPrice(String input) {
        String[] strings = input.split(" ");
        int length = strings.length;
        return Double.parseDouble(strings[length-1]);
    }
}
