package com.learning.learningapp2022.ganeshhegde.databinding;
import com.learning.learningapp2022.ganeshhegde.R;
import com.learning.learningapp2022.ganeshhegde.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RoomSubscribersBindingImpl extends RoomSubscribersBinding implements com.learning.learningapp2022.ganeshhegde.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerSubscriber, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener btnClearandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of subViewModel.clearText.getValue()
            //         is subViewModel.clearText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(btnClear);
            // localize variables for thread safety
            // subViewModel.clearText
            androidx.lifecycle.MutableLiveData<java.lang.String> subViewModelClearText = null;
            // subViewModel
            com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeViewModel subViewModel = mSubViewModel;
            // subViewModel.clearText.getValue()
            java.lang.String subViewModelClearTextGetValue = null;
            // subViewModel != null
            boolean subViewModelJavaLangObjectNull = false;
            // subViewModel.clearText != null
            boolean subViewModelClearTextJavaLangObjectNull = false;



            subViewModelJavaLangObjectNull = (subViewModel) != (null);
            if (subViewModelJavaLangObjectNull) {


                subViewModelClearText = subViewModel.getClearText();

                subViewModelClearTextJavaLangObjectNull = (subViewModelClearText) != (null);
                if (subViewModelClearTextJavaLangObjectNull) {




                    subViewModelClearText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener btnSaveandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of subViewModel.saveText.getValue()
            //         is subViewModel.saveText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(btnSave);
            // localize variables for thread safety
            // subViewModel.saveText.getValue()
            java.lang.String subViewModelSaveTextGetValue = null;
            // subViewModel.saveText != null
            boolean subViewModelSaveTextJavaLangObjectNull = false;
            // subViewModel
            com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeViewModel subViewModel = mSubViewModel;
            // subViewModel != null
            boolean subViewModelJavaLangObjectNull = false;
            // subViewModel.saveText
            androidx.lifecycle.MutableLiveData<java.lang.String> subViewModelSaveText = null;



            subViewModelJavaLangObjectNull = (subViewModel) != (null);
            if (subViewModelJavaLangObjectNull) {


                subViewModelSaveText = subViewModel.getSaveText();

                subViewModelSaveTextJavaLangObjectNull = (subViewModelSaveText) != (null);
                if (subViewModelSaveTextJavaLangObjectNull) {




                    subViewModelSaveText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editSubEmailAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of subViewModel.inputEmail.getValue()
            //         is subViewModel.inputEmail.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editSubEmailAddress);
            // localize variables for thread safety
            // subViewModel.inputEmail
            androidx.lifecycle.MutableLiveData<java.lang.String> subViewModelInputEmail = null;
            // subViewModel
            com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeViewModel subViewModel = mSubViewModel;
            // subViewModel != null
            boolean subViewModelJavaLangObjectNull = false;
            // subViewModel.inputEmail.getValue()
            java.lang.String subViewModelInputEmailGetValue = null;
            // subViewModel.inputEmail != null
            boolean subViewModelInputEmailJavaLangObjectNull = false;



            subViewModelJavaLangObjectNull = (subViewModel) != (null);
            if (subViewModelJavaLangObjectNull) {


                subViewModelInputEmail = subViewModel.getInputEmail();

                subViewModelInputEmailJavaLangObjectNull = (subViewModelInputEmail) != (null);
                if (subViewModelInputEmailJavaLangObjectNull) {




                    subViewModelInputEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editSubscriberNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of subViewModel.inputName.getValue()
            //         is subViewModel.inputName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editSubscriberName);
            // localize variables for thread safety
            // subViewModel.inputName != null
            boolean subViewModelInputNameJavaLangObjectNull = false;
            // subViewModel.inputName.getValue()
            java.lang.String subViewModelInputNameGetValue = null;
            // subViewModel
            com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeViewModel subViewModel = mSubViewModel;
            // subViewModel != null
            boolean subViewModelJavaLangObjectNull = false;
            // subViewModel.inputName
            androidx.lifecycle.MutableLiveData<java.lang.String> subViewModelInputName = null;



            subViewModelJavaLangObjectNull = (subViewModel) != (null);
            if (subViewModelJavaLangObjectNull) {


                subViewModelInputName = subViewModel.getInputName();

                subViewModelInputNameJavaLangObjectNull = (subViewModelInputName) != (null);
                if (subViewModelInputNameJavaLangObjectNull) {




                    subViewModelInputName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public RoomSubscribersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RoomSubscribersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            );
        this.btnClear.setTag(null);
        this.btnSave.setTag(null);
        this.editSubEmailAddress.setTag(null);
        this.editSubscriberName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.learning.learningapp2022.ganeshhegde.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.learning.learningapp2022.ganeshhegde.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.subViewModel == variableId) {
            setSubViewModel((com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubViewModel(@Nullable com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeViewModel SubViewModel) {
        this.mSubViewModel = SubViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.subViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSubViewModelInputEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeSubViewModelSaveText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeSubViewModelInputName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeSubViewModelClearText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSubViewModelInputEmail(androidx.lifecycle.MutableLiveData<java.lang.String> SubViewModelInputEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSubViewModelSaveText(androidx.lifecycle.MutableLiveData<java.lang.String> SubViewModelSaveText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSubViewModelInputName(androidx.lifecycle.MutableLiveData<java.lang.String> SubViewModelInputName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSubViewModelClearText(androidx.lifecycle.MutableLiveData<java.lang.String> SubViewModelClearText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String subViewModelInputEmailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> subViewModelInputEmail = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> subViewModelSaveText = null;
        com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeViewModel subViewModel = mSubViewModel;
        java.lang.String subViewModelClearTextGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> subViewModelInputName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> subViewModelClearText = null;
        java.lang.String subViewModelInputNameGetValue = null;
        java.lang.String subViewModelSaveTextGetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (subViewModel != null) {
                        // read subViewModel.inputEmail
                        subViewModelInputEmail = subViewModel.getInputEmail();
                    }
                    updateLiveDataRegistration(0, subViewModelInputEmail);


                    if (subViewModelInputEmail != null) {
                        // read subViewModel.inputEmail.getValue()
                        subViewModelInputEmailGetValue = subViewModelInputEmail.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (subViewModel != null) {
                        // read subViewModel.saveText
                        subViewModelSaveText = subViewModel.getSaveText();
                    }
                    updateLiveDataRegistration(1, subViewModelSaveText);


                    if (subViewModelSaveText != null) {
                        // read subViewModel.saveText.getValue()
                        subViewModelSaveTextGetValue = subViewModelSaveText.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (subViewModel != null) {
                        // read subViewModel.inputName
                        subViewModelInputName = subViewModel.getInputName();
                    }
                    updateLiveDataRegistration(2, subViewModelInputName);


                    if (subViewModelInputName != null) {
                        // read subViewModel.inputName.getValue()
                        subViewModelInputNameGetValue = subViewModelInputName.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (subViewModel != null) {
                        // read subViewModel.clearText
                        subViewModelClearText = subViewModel.getClearText();
                    }
                    updateLiveDataRegistration(3, subViewModelClearText);


                    if (subViewModelClearText != null) {
                        // read subViewModel.clearText.getValue()
                        subViewModelClearTextGetValue = subViewModelClearText.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnClear, subViewModelClearTextGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnClear.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.btnClear, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, btnClearandroidTextAttrChanged);
            this.btnSave.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.btnSave, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, btnSaveandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editSubEmailAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editSubEmailAddressandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editSubscriberName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editSubscriberNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnSave, subViewModelSaveTextGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editSubEmailAddress, subViewModelInputEmailGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editSubscriberName, subViewModelInputNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // subViewModel
                com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeViewModel subViewModel = mSubViewModel;
                // subViewModel != null
                boolean subViewModelJavaLangObjectNull = false;



                subViewModelJavaLangObjectNull = (subViewModel) != (null);
                if (subViewModelJavaLangObjectNull) {


                    subViewModel.clearOrDelete();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // subViewModel
                com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeViewModel subViewModel = mSubViewModel;
                // subViewModel != null
                boolean subViewModelJavaLangObjectNull = false;



                subViewModelJavaLangObjectNull = (subViewModel) != (null);
                if (subViewModelJavaLangObjectNull) {


                    subViewModel.saveOrUpdate();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): subViewModel.inputEmail
        flag 1 (0x2L): subViewModel.saveText
        flag 2 (0x3L): subViewModel.inputName
        flag 3 (0x4L): subViewModel.clearText
        flag 4 (0x5L): subViewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}