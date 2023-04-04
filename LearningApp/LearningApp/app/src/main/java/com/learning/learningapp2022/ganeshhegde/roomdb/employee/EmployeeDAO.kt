package com.learning.learningapp2022.ganeshhegde.roomdb.employee

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface EmployeeDAO {

    @Insert
    suspend fun insertEmployee(employee: Employee)
}