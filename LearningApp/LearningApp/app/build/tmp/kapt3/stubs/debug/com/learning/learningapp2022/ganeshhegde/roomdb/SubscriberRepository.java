package com.learning.learningapp2022.ganeshhegde.roomdb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/roomdb/SubscriberRepository;", "", "dao", "Lcom/learning/learningapp2022/ganeshhegde/roomdb/SubscribeDAO;", "(Lcom/learning/learningapp2022/ganeshhegde/roomdb/SubscribeDAO;)V", "subscribers", "Landroidx/lifecycle/LiveData;", "", "Lcom/learning/learningapp2022/ganeshhegde/roomdb/Subscriber;", "getSubscribers", "()Landroidx/lifecycle/LiveData;", "delete", "", "subscriber", "(Lcom/learning/learningapp2022/ganeshhegde/roomdb/Subscriber;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "update", "app_debug"})
public final class SubscriberRepository {
    private final com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeDAO dao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber>> subscribers = null;
    
    public SubscriberRepository(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.SubscribeDAO dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber>> getSubscribers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}