package com.salesTax;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SalesTaxTest {

    @Test
    public void shouldReturnFalseWhenThereIsNoImportWordInInput() {
        SalesTax salesTax = new SalesTax();

        assertFalse(salesTax.calculate(" "));
    }

    @Test
    public void shouldReturnTrueWhenThereIsNoImportWordInInput() {
        SalesTax salesTax = new SalesTax();

        assertTrue(salesTax.calculate("1 box of imported cups"));
    }

    @Test
    public void shouldReturnThePrice() {
        SalesTax salesTax = new SalesTax();

        assertEquals(1.24, salesTax.getPrice("1 book at 1.24 "), 0.01);
    }
}
