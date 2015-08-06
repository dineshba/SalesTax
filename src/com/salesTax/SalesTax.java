package com.salesTax;


public class SalesTax {
    String[] predefined = {"food", "chocolate", "book", "pills", "chocolates"};
    double total;
    double salesTax;
    String input;

    public boolean calculate(String input) {
        this.input = input;
        String[] strings = input.split(" ");
        int length = strings.length;

        for (String string : strings) {
            if (string.equals("imported")) {
                total = getPrice(this.input);
                total *= 1.05;
                return true;
            }
        }
        return false;
    }

    public double getPrice(String input) {
        String[] strings = input.split(" ");
        int length = strings.length;
        return Double.parseDouble(strings[length-1]);
    }

    @Override
    public String toString() {
        return "Total = " + total;
    }
}
