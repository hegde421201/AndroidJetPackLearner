package com.learning.learningapp2022.ganeshhegde.roomdb.employee

import android.os.Bundle
import android.text.InputFilter
import android.text.Spanned
import android.text.method.DigitsKeyListener
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.learning.learningapp2022.ganeshhegde.R
import kotlinx.coroutines.launch
import java.lang.Boolean
import kotlin.CharSequence
import kotlin.Int
import kotlin.String
import kotlin.arrayOf


class EmployeeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)

        val dao = EmployeeDatabase.getInstance(application).employeeDao

        val nameText = findViewById<EditText>(R.id.editTextPersonName)
        val emailText = findViewById<EditText>(R.id.editTextEmailAddress)
        val submitButton = findViewById<Button>(R.id.btnSubmit)

        val salaryText = findViewById<EditText>(R.id.editTextSalary)




        salaryText.filters = arrayOf(DecimalDigitsInputFilter(8, 2))

        submitButton.setOnClickListener{

            lifecycleScope.launch {

                if(nameText.text.isNullOrEmpty()){
                    Toast.makeText(application,"Please enter name",Toast.LENGTH_LONG).show()
                }else if(emailText.text.isNullOrEmpty()){
                    Toast.makeText(application,"Please enter email",Toast.LENGTH_LONG).show()
                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(emailText.text.toString()).matches()){
                    Toast.makeText(application,"Email invalid",Toast.LENGTH_LONG).show()
                }
                else if(salaryText.text.isNullOrEmpty() || salaryText.text.toString().toDouble() == 0.0) {
                    Toast.makeText(application,"Please enter salary",Toast.LENGTH_LONG).show()
                }
                else
                {
                    dao.insertEmployee(Employee(0,nameText.text.toString(),emailText.text.toString(),salaryText.text.toString().toDouble()))
                    nameText.setText("")
                    emailText.setText("")
                    salaryText.setText("")
                }

            }
        }

    }
}