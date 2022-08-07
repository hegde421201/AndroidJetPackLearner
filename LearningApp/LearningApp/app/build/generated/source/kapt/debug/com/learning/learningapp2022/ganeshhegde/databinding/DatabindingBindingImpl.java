package com.learning.learningapp2022.ganeshhegde.databinding;
import com.learning.learningapp2022.ganeshhegde.R;
import com.learning.learningapp2022.ganeshhegde.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DatabindingBindingImpl extends DatabindingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewDisplay, 2);
        sViewsWithIds.put(R.id.editTextAnything, 3);
        sViewsWithIds.put(R.id.buttonClickMe, 4);
        sViewsWithIds.put(R.id.startMe, 5);
        sViewsWithIds.put(R.id.progressBar, 6);
        sViewsWithIds.put(R.id.employee_button, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DatabindingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private DatabindingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.Button) bindings[7]
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.employee == variableId) {
            setEmployee((com.learning.learningapp2022.ganeshhegde.databinding.Employee) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEmployee(@Nullable com.learning.learningapp2022.ganeshhegde.databinding.Employee Employee) {
        this.mEmployee = Employee;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.employee);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String employeeNameConcatTextViewNameAndroidStringComma = null;
        com.learning.learningapp2022.ganeshhegde.databinding.Employee employee = mEmployee;
        java.lang.String employeeNameConcatTextViewNameAndroidStringCommaConcatEmployeeEmail = null;
        java.lang.String employeeEmail = null;
        java.lang.String employeeName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (employee != null) {
                    // read employee.email
                    employeeEmail = employee.getEmail();
                    // read employee.name
                    employeeName = employee.getName();
                }


                if (employeeName != null) {
                    // read employee.name.concat(@android:string/comma)
                    employeeNameConcatTextViewNameAndroidStringComma = employeeName.concat(textViewName.getResources().getString(R.string.comma));
                }


                if (employeeNameConcatTextViewNameAndroidStringComma != null) {
                    // read employee.name.concat(@android:string/comma).concat(employee.email)
                    employeeNameConcatTextViewNameAndroidStringCommaConcatEmployeeEmail = employeeNameConcatTextViewNameAndroidStringComma.concat(employeeEmail);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewName, employeeNameConcatTextViewNameAndroidStringCommaConcatEmployeeEmail);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): employee
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}