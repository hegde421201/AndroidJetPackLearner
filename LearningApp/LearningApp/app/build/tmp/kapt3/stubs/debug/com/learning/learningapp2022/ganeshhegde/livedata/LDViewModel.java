package com.learning.learningapp2022.ganeshhegde.livedata;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/livedata/LDViewModel;", "Landroidx/lifecycle/ViewModel;", "number", "", "(D)V", "multData", "Landroidx/lifecycle/LiveData;", "getMultData", "()Landroidx/lifecycle/LiveData;", "multiplier", "Landroidx/lifecycle/MutableLiveData;", "userInput", "", "getUserInput", "()Landroidx/lifecycle/MutableLiveData;", "setUserInput", "(Landroidx/lifecycle/MutableLiveData;)V", "multAnswer", "", "input", "app_debug"})
public final class LDViewModel extends androidx.lifecycle.ViewModel {
    private final double number = 0.0;
    private androidx.lifecycle.MutableLiveData<java.lang.Double> multiplier;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> userInput;
    
    public LDViewModel(double number) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUserInput() {
        return null;
    }
    
    public final void setUserInput(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getMultData() {
        return null;
    }
    
    public final void multAnswer(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
    }
}