package com.learning.learningapp2022.ganeshhegde.roomdb.employee;

import androidx.annotation.NonNull;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
class EmployeeDatabase_AutoMigration_2_3_Impl extends Migration {
  private final AutoMigrationSpec callback = new EmployeeDatabase.Migration2To3();

  public EmployeeDatabase_AutoMigration_2_3_Impl() {
    super(2, 3);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("CREATE TABLE IF NOT EXISTS `_new_employee_info` (`emp_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `emp_name` TEXT NOT NULL, `emp_email` TEXT NOT NULL, `emp_ctc` REAL NOT NULL DEFAULT 0.0)");
    database.execSQL("INSERT INTO `_new_employee_info` (`emp_id`,`emp_name`,`emp_email`,`emp_ctc`) SELECT `emp_id`,`emp_name`,`emp_email`,`emp_salary` FROM `employee_info`");
    database.execSQL("DROP TABLE `employee_info`");
    database.execSQL("ALTER TABLE `_new_employee_info` RENAME TO `employee_info`");
    callback.onPostMigrate(database);
  }
}
