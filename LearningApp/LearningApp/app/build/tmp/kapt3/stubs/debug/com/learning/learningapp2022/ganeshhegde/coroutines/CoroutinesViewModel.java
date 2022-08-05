package com.learning.learningapp2022.ganeshhegde.coroutines;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/coroutines/CoroutinesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "myJob", "Lkotlinx/coroutines/CompletableJob;", "myScope", "Lkotlinx/coroutines/CoroutineScope;", "userRepository", "Lcom/learning/learningapp2022/ganeshhegde/coroutines/UserRepository;", "users", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/learning/learningapp2022/ganeshhegde/coroutines/User;", "getUsers", "()Landroidx/lifecycle/MutableLiveData;", "setUsers", "(Landroidx/lifecycle/MutableLiveData;)V", "getUserData", "", "app_debug"})
public final class CoroutinesViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.CompletableJob myJob = null;
    private final kotlinx.coroutines.CoroutineScope myScope = null;
    private com.learning.learningapp2022.ganeshhegde.coroutines.UserRepository userRepository;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.learning.learningapp2022.ganeshhegde.coroutines.User>> users;
    
    public CoroutinesViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.learning.learningapp2022.ganeshhegde.coroutines.User>> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.learning.learningapp2022.ganeshhegde.coroutines.User>> p0) {
    }
    
    public final void getUserData() {
    }
}