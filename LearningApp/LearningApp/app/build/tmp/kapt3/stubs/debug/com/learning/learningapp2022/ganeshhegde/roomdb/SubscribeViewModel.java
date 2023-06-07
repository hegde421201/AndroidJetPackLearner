package com.learning.learningapp2022.ganeshhegde.roomdb;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010$\u001a\u00020\u001dJ\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006&"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/roomdb/SubscribeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/learning/learningapp2022/ganeshhegde/roomdb/SubscriberRepository;", "(Lcom/learning/learningapp2022/ganeshhegde/roomdb/SubscriberRepository;)V", "clearText", "Landroidx/lifecycle/MutableLiveData;", "", "getClearText", "()Landroidx/lifecycle/MutableLiveData;", "inputEmail", "getInputEmail", "setInputEmail", "(Landroidx/lifecycle/MutableLiveData;)V", "inputName", "getInputName", "setInputName", "isUpdateOrDelete", "", "saveText", "getSaveText", "subUpdateOrDelete", "Lcom/learning/learningapp2022/ganeshhegde/roomdb/Subscriber;", "subscribers", "Landroidx/lifecycle/LiveData;", "", "getSubscribers", "()Landroidx/lifecycle/LiveData;", "clearAll", "", "clearOrDelete", "delete", "Lkotlinx/coroutines/Job;", "subscriber", "initUpdateOrDelete", "insert", "saveOrUpdate", "update", "app_debug"})
public final class SubscribeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.learning.learningapp2022.ganeshhegde.roomdb.SubscriberRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> inputName;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> inputEmail;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> clearText = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> saveText = null;
    private boolean isUpdateOrDelete = false;
    private com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subUpdateOrDelete;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber>> subscribers = null;
    
    public SubscribeViewModel(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.SubscriberRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getInputName() {
        return null;
    }
    
    public final void setInputName(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getInputEmail() {
        return null;
    }
    
    public final void setInputEmail(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getClearText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSaveText() {
        return null;
    }
    
    public final void initUpdateOrDelete(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber) {
    }
    
    public final void saveOrUpdate() {
    }
    
    public final void clearOrDelete() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber>> getSubscribers() {
        return null;
    }
    
    public final void clearAll() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber) {
        return null;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber) {
        return null;
    }
}