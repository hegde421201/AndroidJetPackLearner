package com.learning.demo.testdemos.view

class TaxCalculator {

    fun calculateTax(income: Double,taxRate:Double) : Double{

        return income * taxRate
    }

    fun calculateIncome(income: Double,taxRate:Double) : Double{

        return income - calculateTax(income,taxRate)

    }
}