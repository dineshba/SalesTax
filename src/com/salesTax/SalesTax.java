package com.salesTax;


public class SalesTax {
    String[] predefined = {"food", "chocolate", "book", "pills", "chocolates"};
    double total;
    double salesTax;
    String input;
    private int count = 0;

    public boolean calculate(String input) {
        this.input = input;
        String[] strings = input.split(" ");
        total = getPrice(this.input);

        for (String string : strings) {
            for (String predefine : predefined) {
                if (predefine.equals(string))
                    count =1;
            }
        }

        if (count != 1)
            total *= 1.1;
        salesTax = total - getPrice(input);

        for (String string : strings) {
            if (string.equals("imported")) {
                total *= 1.05;
                salesTax = total - getPrice(input);
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
        return "Sales Taxes = " + salesTax + "\nTotal = " + total ;
    }
}
