package com.learning.demo.testdemos

import com.google.common.truth.Truth.assertThat
import com.learning.demo.testdemos.view.TaxCalculator
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TaxCalculatorTest {

   private lateinit var tax1 : TaxCalculator

    @BeforeEach
    fun setup(){
        tax1 = TaxCalculator()
    }

    @Test
    fun calculateTax() {

        val taxPaid = tax1.calculateTax(1200.0,3/100.0)
        assertThat(taxPaid).isEqualTo(36.0)
    }

    @Test
    fun calculateIncome() {
        val income = tax1.calculateIncome(1200.0,3/100.0)
        assertThat(income).isEqualTo(1164.0)

    }
}