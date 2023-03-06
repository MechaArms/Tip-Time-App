package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00  // val to calc
        val tipPercent = 20.00  // val percent of the tip
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)  // the expected answer of the val calculated with the tip
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)  // the test
        assertEquals(expectedTip, actualTip)  // the checking values
    }
}