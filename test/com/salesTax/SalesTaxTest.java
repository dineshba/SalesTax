package com.salesTax;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
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
}
