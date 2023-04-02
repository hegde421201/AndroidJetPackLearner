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
    private androidx.databinding.InverseBindingListener editTextNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ldExampleViewModel.userName.getValue()
            //         is ldExampleViewModel.userName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextName);
            // localize variables for thread safety
            // ldExampleViewModel != null
            boolean ldExampleViewModelJavaLangObjectNull = false;
            // ldExampleViewModel.userName.getValue()
            java.lang.String ldExampleViewModelUserNameGetValue = null;
            // ldExampleViewModel.userName
            androidx.lifecycle.MutableLiveData<java.lang.String> ldExampleViewModelUserName = null;
            // ldExampleViewModel
            com.learning.learningapp2022.ganeshhegde.livedata.LDViewModel ldExampleViewModel = mLdExampleViewModel;
            // ldExampleViewModel.userName != null
            boolean ldExampleViewModelUserNameJavaLangObjectNull = false;



            ldExampleViewModelJavaLangObjectNull = (ldExampleViewModel) != (null);
            if (ldExampleViewModelJavaLangObjectNull) {


                ldExampleViewModelUserName = ldExampleViewModel.getUserName();

                ldExampleViewModelUserNameJavaLangObjectNull = (ldExampleViewModelUserName) != (null);
                if (ldExampleViewModelUserNameJavaLangObjectNull) {




                    ldExampleViewModelUserName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public LivedataexampleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private LivedataexampleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.buttonDouble.setTag(null);
        this.editTextDouble.setTag(null);
        this.editTextName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        this.twoWayText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.learning.learningapp2022.ganeshhegde.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.ldExampleViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLdExampleViewModelUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLdExampleViewModelUserInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeLdExampleViewModelMultData((androidx.lifecycle.LiveData<java.lang.Double>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLdExampleViewModelUserName(androidx.lifecycle.MutableLiveData<java.lang.String> LdExampleViewModelUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLdExampleViewModelUserInput(androidx.lifecycle.MutableLiveData<java.lang.String> LdExampleViewModelUserInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLdExampleViewModelMultData(androidx.lifecycle.LiveData<java.lang.Double> LdExampleViewModelMultData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String ldExampleViewModelUserNameGetValue = null;
        com.learning.learningapp2022.ganeshhegde.livedata.LDViewModel ldExampleViewModel = mLdExampleViewModel;
        java.lang.Double ldExampleViewModelMultDataGetValue = null;
        double androidxDatabindingViewDataBindingSafeUnboxLdExampleViewModelMultDataGetValue = 0.0;
        java.lang.String stringValueOfLdExampleViewModelMultData = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> ldExampleViewModelUserName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> ldExampleViewModelUserInput = null;
        androidx.lifecycle.LiveData<java.lang.Double> ldExampleViewModelMultData = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (ldExampleViewModel != null) {
                        // read ldExampleViewModel.userName
                        ldExampleViewModelUserName = ldExampleViewModel.getUserName();
                    }
                    updateLiveDataRegistration(0, ldExampleViewModelUserName);


                    if (ldExampleViewModelUserName != null) {
                        // read ldExampleViewModel.userName.getValue()
                        ldExampleViewModelUserNameGetValue = ldExampleViewModelUserName.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (ldExampleViewModel != null) {
                        // read ldExampleViewModel.userInput
                        ldExampleViewModelUserInput = ldExampleViewModel.getUserInput();
                    }
                    updateLiveDataRegistration(1, ldExampleViewModelUserInput);


                    if (ldExampleViewModelUserInput != null) {
                        // read ldExampleViewModel.userInput.getValue()
                        ldExampleViewModelUserInputGetValue = ldExampleViewModelUserInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (ldExampleViewModel != null) {
                        // read ldExampleViewModel.multData
                        ldExampleViewModelMultData = ldExampleViewModel.getMultData();
                    }
                    updateLiveDataRegistration(2, ldExampleViewModelMultData);


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
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.buttonDouble.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextDouble, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextDoubleandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextDouble, ldExampleViewModelUserInputGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextName, ldExampleViewModelUserNameGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.twoWayText, ldExampleViewModelUserNameGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
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
        flag 0 (0x1L): ldExampleViewModel.userName
        flag 1 (0x2L): ldExampleViewModel.userInput
        flag 2 (0x3L): ldExampleViewModel.multData
        flag 3 (0x4L): ldExampleViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}