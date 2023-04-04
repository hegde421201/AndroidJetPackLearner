package com.learning.learningapp2022.ganeshhegde.roomdb.employee;

import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class EmployeeDAO_Impl implements EmployeeDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Employee> __insertionAdapterOfEmployee;

  public EmployeeDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEmployee = new EntityInsertionAdapter<Employee>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `employee_info` (`emp_id`,`emp_name`,`emp_email`,`emp_salary`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Employee value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        stmt.bindDouble(4, value.getSalary());
      }
    };
  }

  @Override
  public Object insertEmployee(final Employee employee,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEmployee.insert(employee);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
