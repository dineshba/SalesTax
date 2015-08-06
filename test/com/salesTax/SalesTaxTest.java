package com.salesTax;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class SalesTaxTest {

    @Test
    public void shouldReturnTrueWhenThereIsNoImportWordInInput() {
        SalesTax salesTax = new SalesTax();

        assertFalse(salesTax.calculate(" "));
    }

}
