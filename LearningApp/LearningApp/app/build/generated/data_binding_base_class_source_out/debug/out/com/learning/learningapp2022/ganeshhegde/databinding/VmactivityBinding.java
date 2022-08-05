// Generated by data binding compiler. Do not edit!
package com.learning.learningapp2022.ganeshhegde.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.learning.learningapp2022.ganeshhegde.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class VmactivityBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonAdd;

  @NonNull
  public final Button buttonCounter;

  @NonNull
  public final EditText editTextNumber;

  @NonNull
  public final TextView textAdd;

  @NonNull
  public final TextView txtClicks;

  protected VmactivityBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button buttonAdd, Button buttonCounter, EditText editTextNumber, TextView textAdd,
      TextView txtClicks) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonAdd = buttonAdd;
    this.buttonCounter = buttonCounter;
    this.editTextNumber = editTextNumber;
    this.textAdd = textAdd;
    this.txtClicks = txtClicks;
  }

  @NonNull
  public static VmactivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.vmactivity, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VmactivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VmactivityBinding>inflateInternal(inflater, R.layout.vmactivity, root, attachToRoot, component);
  }

  @NonNull
  public static VmactivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.vmactivity, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VmactivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VmactivityBinding>inflateInternal(inflater, R.layout.vmactivity, null, false, component);
  }

  public static VmactivityBinding bind(@NonNull View view) {
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
  public static VmactivityBinding bind(@NonNull View view, @Nullable Object component) {
    return (VmactivityBinding)bind(component, view, R.layout.vmactivity);
  }
}