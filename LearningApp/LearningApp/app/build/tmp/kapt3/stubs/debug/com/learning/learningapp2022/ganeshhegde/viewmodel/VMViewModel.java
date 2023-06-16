package com.learning.learningapp2022.ganeshhegde.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/viewmodel/VMViewModel;", "Landroidx/lifecycle/ViewModel;", "startValue", "", "(J)V", "adder", "count", "", "getCurrentClickCount", "getInitialSum", "getUpdatedCounter", "getUserNumber", "nums", "onCleared", "", "app_debug"})
public final class VMViewModel extends androidx.lifecycle.ViewModel {
    private int count = 0;
    private long adder = 0L;
    
    public VMViewModel(long startValue) {
        super();
    }
    
    public final long getInitialSum() {
        return 0L;
    }
    
    public final int getCurrentClickCount() {
        return 0;
    }
    
    public final int getUpdatedCounter() {
        return 0;
    }
    
    public final long getUserNumber(long nums) {
        return 0L;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}