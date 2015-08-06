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
}
