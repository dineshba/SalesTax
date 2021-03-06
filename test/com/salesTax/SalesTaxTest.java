package com.salesTax;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class SalesTaxTest {

    @Test
    public void shouldReturnFalseWhenThereIsNoImportWordInInput() {
        SalesTax salesTax = new SalesTax();

        assertFalse(salesTax.calculate(" 0"));
    }

    @Test
    public void shouldReturnTrueWhenThereIsNoImportWordInInput() {
        SalesTax salesTax = new SalesTax();

        assertTrue(salesTax.calculate("1 box of imported cups at 10"));
    }

    @Test
    public void shouldReturnThePrice() {
        SalesTax salesTax = new SalesTax();

        assertEquals(1.24, salesTax.getPrice("1 book at 1.24 "), 0.01);
    }

    @Test
    public void salesTaxIsFivePercentageForImportedGoods() {
        SalesTax salesTax = new SalesTax();

        salesTax.calculate("imported book 10");

        assertEquals("Sales Taxes = 0.5\nTotal = 10.5", salesTax.toString());
    }

    @Test
    public void salesTaxIsTenPercentageForNonImportedGoodsOtherThanBookFoodMedicine() {
        SalesTax salesTax = new SalesTax();

        salesTax.calculate("perfume 10");

        assertEquals("Sales Taxes = 1.0\nTotal = 11.0", salesTax.toString());
    }

    @Test
    public void salesTaxIsZeroPercentageForNonImportedBookFoodMedicine() {
        SalesTax salesTax = new SalesTax();

        salesTax.calculate("book dsd 10");

        assertEquals("Sales Taxes = 0.0\nTotal = 10.0", salesTax.toString());
    }

    @Test
    public void salesTaxIsFifteenPercentageForImportedItemOtherThanBookFoodMedicine() {
        SalesTax salesTax = new SalesTax();

        salesTax.calculate("1 imported perfume is at 10");

        assertEquals("Sales Taxes = 1.5500000000000007\nTotal = 11.55", salesTax.toString());
    }
}
