package com.learning.learningapp2022.ganeshhegde.databinding;
import com.learning.learningapp2022.ganeshhegde.R;
import com.learning.learningapp2022.ganeshhegde.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LivedataexampleBindingImpl extends LivedataexampleBinding implements com.learning.learningapp2022.ganeshhegde.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextDoubleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ldExampleViewModel.userInput.getValue()
            //         is ldExampleViewModel.userInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextDouble);
            // localize variables for thread safety
            // ldExampleViewModel != null
            boolean ldExampleViewModelJavaLangObjectNull = false;
            // ldExampleViewModel.userInput.getValue()
            java.lang.String ldExampleViewModelUserInputGetValue = null;
            // ldExampleViewModel
            com.learning.learningapp2022.ganeshhegde.livedata.LDViewModel ldExampleViewModel = mLdExampleViewModel;
            // ldExampleViewModel.userInput != null
            boolean ldExampleViewModelUserInputJavaLangObjectNull = false;
            // ldExampleViewModel.userInput
            androidx.lifecycle.MutableLiveData<java.lang.String> ldExampleViewModelUserInput = null;



            ldExampleViewModelJavaLangObjectNull = (ldExampleViewModel) != (null);
            if (ldExampleViewModelJavaLangObjectNull) {


                ldExampleViewModelUserInput = ldExampleViewModel.getUserInput();

                ldExampleViewModelUserInputJavaLangObjectNull = (ldExampleViewModelUserInput) != (null);
                if (ldExampleViewModelUserInputJavaLangObjectNull) {




                    ldExampleViewModelUserInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public LivedataexampleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LivedataexampleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.buttonDouble.setTag(null);
        this.editTextDouble.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.learning.learningapp2022.ganeshhegde.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.ldExampleViewModel == variableId) {
            setLdExampleViewModel((com.learning.learningapp2022.ganeshhegde.livedata.LDViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLdExampleViewModel(@Nullable com.learning.learningapp2022.ganeshhegde.livedata.LDViewModel LdExampleViewModel) {
        this.mLdExampleViewModel = LdExampleViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.ldExampleViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLdExampleViewModelUserInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLdExampleViewModelMultData((androidx.lifecycle.LiveData<java.lang.Double>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLdExampleViewModelUserInput(androidx.lifecycle.MutableLiveData<java.lang.String> LdExampleViewModelUserInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLdExampleViewModelMultData(androidx.lifecycle.LiveData<java.lang.Double> LdExampleViewModelMultData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.lang.String ldExampleViewModelUserInputGetValue = null;
        com.learning.learningapp2022.ganeshhegde.livedata.LDViewModel ldExampleViewModel = mLdExampleViewModel;
        java.lang.Double ldExampleViewModelMultDataGetValue = null;
        double androidxDatabindingViewDataBindingSafeUnboxLdExampleViewModelMultDataGetValue = 0.0;
        java.lang.String stringValueOfLdExampleViewModelMultData = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> ldExampleViewModelUserInput = null;
        androidx.lifecycle.LiveData<java.lang.Double> ldExampleViewModelMultData = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (ldExampleViewModel != null) {
                        // read ldExampleViewModel.userInput
                        ldExampleViewModelUserInput = ldExampleViewModel.getUserInput();
                    }
                    updateLiveDataRegistration(0, ldExampleViewModelUserInput);


                    if (ldExampleViewModelUserInput != null) {
                        // read ldExampleViewModel.userInput.getValue()
                        ldExampleViewModelUserInputGetValue = ldExampleViewModelUserInput.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (ldExampleViewModel != null) {
                        // read ldExampleViewModel.multData
                        ldExampleViewModelMultData = ldExampleViewModel.getMultData();
                    }
                    updateLiveDataRegistration(1, ldExampleViewModelMultData);


                    if (ldExampleViewModelMultData != null) {
                        // read ldExampleViewModel.multData.getValue()
                        ldExampleViewModelMultDataGetValue = ldExampleViewModelMultData.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ldExampleViewModel.multData.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLdExampleViewModelMultDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(ldExampleViewModelMultDataGetValue);


                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(ldExampleViewModel.multData.getValue()))
                    stringValueOfLdExampleViewModelMultData = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxLdExampleViewModelMultDataGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.buttonDouble.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextDouble, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextDoubleandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextDouble, ldExampleViewModelUserInputGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, stringValueOfLdExampleViewModelMultData);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // ldExampleViewModel != null
        boolean ldExampleViewModelJavaLangObjectNull = false;
        // ldExampleViewModel.userInput.getValue()
        java.lang.String ldExampleViewModelUserInputGetValue = null;
        // ldExampleViewModel
        com.learning.learningapp2022.ganeshhegde.livedata.LDViewModel ldExampleViewModel = mLdExampleViewModel;
        // ldExampleViewModel.userInput != null
        boolean ldExampleViewModelUserInputJavaLangObjectNull = false;
        // ldExampleViewModel.userInput
        androidx.lifecycle.MutableLiveData<java.lang.String> ldExampleViewModelUserInput = null;



        ldExampleViewModelJavaLangObjectNull = (ldExampleViewModel) != (null);
        if (ldExampleViewModelJavaLangObjectNull) {




            ldExampleViewModelUserInput = ldExampleViewModel.getUserInput();

            ldExampleViewModelUserInputJavaLangObjectNull = (ldExampleViewModelUserInput) != (null);
            if (ldExampleViewModelUserInputJavaLangObjectNull) {


                ldExampleViewModelUserInputGetValue = ldExampleViewModelUserInput.getValue();

                ldExampleViewModel.multAnswer(ldExampleViewModelUserInputGetValue);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ldExampleViewModel.userInput
        flag 1 (0x2L): ldExampleViewModel.multData
        flag 2 (0x3L): ldExampleViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}