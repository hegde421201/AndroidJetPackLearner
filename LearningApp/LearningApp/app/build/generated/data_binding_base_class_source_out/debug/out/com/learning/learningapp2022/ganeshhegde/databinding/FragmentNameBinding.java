// Generated by data binding compiler. Do not edit!
package com.learning.learningapp2022.ganeshhegde.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.learning.learningapp2022.ganeshhegde.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNameBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonNext;

  @NonNull
  public final EditText editTextName2;

  protected FragmentNameBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button buttonNext, EditText editTextName2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonNext = buttonNext;
    this.editTextName2 = editTextName2;
  }

  @NonNull
  public static FragmentNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_name, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNameBinding>inflateInternal(inflater, R.layout.fragment_name, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_name, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNameBinding>inflateInternal(inflater, R.layout.fragment_name, null, false, component);
  }

  public static FragmentNameBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentNameBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentNameBinding)bind(component, view, R.layout.fragment_name);
  }
}