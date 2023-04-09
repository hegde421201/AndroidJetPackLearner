package com.learning.learningapp2022.ganeshhegde.di.phone;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/di/phone/SmartPhone;", "", "battery", "Lcom/learning/learningapp2022/ganeshhegde/di/phone/Battery;", "simCard", "Lcom/learning/learningapp2022/ganeshhegde/di/phone/SimCard;", "memoryCard", "Lcom/learning/learningapp2022/ganeshhegde/di/phone/MemoryCard;", "(Lcom/learning/learningapp2022/ganeshhegde/di/phone/Battery;Lcom/learning/learningapp2022/ganeshhegde/di/phone/SimCard;Lcom/learning/learningapp2022/ganeshhegde/di/phone/MemoryCard;)V", "getBattery", "()Lcom/learning/learningapp2022/ganeshhegde/di/phone/Battery;", "getMemoryCard", "()Lcom/learning/learningapp2022/ganeshhegde/di/phone/MemoryCard;", "getSimCard", "()Lcom/learning/learningapp2022/ganeshhegde/di/phone/SimCard;", "makeACallWithRecording", "", "app_debug"})
@javax.inject.Singleton()
public final class SmartPhone {
    @org.jetbrains.annotations.NotNull()
    private final com.learning.learningapp2022.ganeshhegde.di.phone.Battery battery = null;
    @org.jetbrains.annotations.NotNull()
    private final com.learning.learningapp2022.ganeshhegde.di.phone.SimCard simCard = null;
    @org.jetbrains.annotations.NotNull()
    private final com.learning.learningapp2022.ganeshhegde.di.phone.MemoryCard memoryCard = null;
    
    @javax.inject.Inject()
    public SmartPhone(@org.jetbrains.annotations.NotNull()
    com.learning.learningapp2022.ganeshhegde.di.phone.Battery battery, @org.jetbrains.annotations.NotNull()
    com.learning.learningapp2022.ganeshhegde.di.phone.SimCard simCard, @org.jetbrains.annotations.NotNull()
    com.learning.learningapp2022.ganeshhegde.di.phone.MemoryCard memoryCard) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.learning.learningapp2022.ganeshhegde.di.phone.Battery getBattery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.learning.learningapp2022.ganeshhegde.di.phone.SimCard getSimCard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.learning.learningapp2022.ganeshhegde.di.phone.MemoryCard getMemoryCard() {
        return null;
    }
    
    public final void makeACallWithRecording() {
    }
}