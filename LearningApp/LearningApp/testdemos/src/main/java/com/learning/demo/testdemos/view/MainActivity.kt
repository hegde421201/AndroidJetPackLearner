package com.learning.demo.testdemos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learning.demo.testdemos.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taxCalculator = TaxCalculator()

        val income = taxCalculator.calculateIncome(1200.0,3/100.0) //3 percent tax, 1200 income
        val tax = taxCalculator.calculateTax(1200.0,3/100.0)

        println("Net Income $income")
        println("Tax $tax")

    }
}