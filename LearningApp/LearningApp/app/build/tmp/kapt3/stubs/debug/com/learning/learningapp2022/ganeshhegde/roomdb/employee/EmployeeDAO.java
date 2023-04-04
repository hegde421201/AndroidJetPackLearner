package com.learning.learningapp2022.ganeshhegde.roomdb.employee;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/roomdb/employee/EmployeeDAO;", "", "insertEmployee", "", "employee", "Lcom/learning/learningapp2022/ganeshhegde/roomdb/employee/Employee;", "(Lcom/learning/learningapp2022/ganeshhegde/roomdb/employee/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface EmployeeDAO {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insertEmployee(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.employee.Employee employee, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}