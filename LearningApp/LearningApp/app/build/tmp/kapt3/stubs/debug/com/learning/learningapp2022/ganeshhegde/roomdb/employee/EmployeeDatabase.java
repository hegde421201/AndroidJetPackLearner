package com.learning.learningapp2022.ganeshhegde.roomdb.employee;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/roomdb/employee/EmployeeDatabase;", "Landroidx/room/RoomDatabase;", "()V", "employeeDao", "Lcom/learning/learningapp2022/ganeshhegde/roomdb/employee/EmployeeDAO;", "getEmployeeDao", "()Lcom/learning/learningapp2022/ganeshhegde/roomdb/employee/EmployeeDAO;", "Companion", "Migration2To3", "app_debug"})
@androidx.room.Database(entities = {com.learning.learningapp2022.ganeshhegde.roomdb.employee.Employee.class}, version = 3, autoMigrations = {@androidx.room.AutoMigration(from = 1, to = 2), @androidx.room.AutoMigration(from = 2, to = 3, spec = com.learning.learningapp2022.ganeshhegde.roomdb.employee.EmployeeDatabase.Migration2To3.class)})
public abstract class EmployeeDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.learning.learningapp2022.ganeshhegde.roomdb.employee.EmployeeDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.learning.learningapp2022.ganeshhegde.roomdb.employee.EmployeeDatabase.Companion Companion = null;
    
    public EmployeeDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.learning.learningapp2022.ganeshhegde.roomdb.employee.EmployeeDAO getEmployeeDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/roomdb/employee/EmployeeDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/learning/learningapp2022/ganeshhegde/roomdb/employee/EmployeeDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.learning.learningapp2022.ganeshhegde.roomdb.employee.EmployeeDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/roomdb/employee/EmployeeDatabase$Migration2To3;", "Landroidx/room/migration/AutoMigrationSpec;", "()V", "app_debug"})
    @androidx.room.RenameColumn(tableName = "employee_info", fromColumnName = "emp_salary", toColumnName = "emp_ctc")
    public static final class Migration2To3 implements androidx.room.migration.AutoMigrationSpec {
        
        public Migration2To3() {
            super();
        }
    }
}