package com.learning.learningapp2022.ganeshhegde.roomdb.employee;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
class EmployeeDatabase_AutoMigration_1_2_Impl extends Migration {
  public EmployeeDatabase_AutoMigration_1_2_Impl() {
    super(1, 2);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("ALTER TABLE `employee_info` ADD COLUMN `emp_salary` REAL NOT NULL DEFAULT 0.0");
  }
}
