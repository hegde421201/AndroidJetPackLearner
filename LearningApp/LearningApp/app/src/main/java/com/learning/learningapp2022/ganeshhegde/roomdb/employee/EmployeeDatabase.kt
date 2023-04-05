package com.learning.learningapp2022.ganeshhegde.roomdb.employee

import android.content.Context
import androidx.room.*
import androidx.room.migration.AutoMigrationSpec


@Database(entities = [Employee::class],version = 3, autoMigrations = [AutoMigration(from = 1, to = 2),
    AutoMigration(from = 2, to = 3, spec = EmployeeDatabase.Migration2To3::class)])
abstract class EmployeeDatabase : RoomDatabase() {

    //reference for the DAO interface
    abstract val employeeDao: EmployeeDAO

    @RenameColumn(tableName = "employee_info", fromColumnName = "emp_salary", toColumnName ="emp_ctc")
    class Migration2To3:AutoMigrationSpec

    //creating just one instance of room database --- using singleton class ---- companion object
    companion object {

        //volatile annotation makes the writes immediately visible to other threads

        @Volatile
        private var INSTANCE : EmployeeDatabase? = null

        fun getInstance(context: Context):EmployeeDatabase{
            synchronized(this){
                var instance = INSTANCE
                if(instance == null){ //creating the singleton INSTANCE of the database -- name is employee_database
                    instance = Room.databaseBuilder(context.applicationContext,EmployeeDatabase::class.java,"employee_database").build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }

}