package com.learning.learningapp2022.ganeshhegde.roomdb;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/roomdb/SubscribeDAO;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSubscriber", "subscriber", "Lcom/learning/learningapp2022/ganeshhegde/roomdb/Subscriber;", "(Lcom/learning/learningapp2022/ganeshhegde/roomdb/Subscriber;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSubscribers", "Landroidx/lifecycle/LiveData;", "", "insertSubscriber", "updateSubscriber", "app_debug"})
public abstract interface SubscribeDAO {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insertSubscriber(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateSubscriber(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteSubscriber(@org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber subscriber, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM subscriber_data_table")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM subscriber_data_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.learning.learningapp2022.ganeshhegde.roomdb.Subscriber>> getAllSubscribers();
}