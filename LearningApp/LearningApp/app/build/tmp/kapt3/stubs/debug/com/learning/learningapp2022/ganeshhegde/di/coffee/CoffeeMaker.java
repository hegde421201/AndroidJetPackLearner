package com.learning.learningapp2022.ganeshhegde.di.coffee;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/di/coffee/CoffeeMaker;", "", "heater", "Lcom/learning/learningapp2022/ganeshhegde/di/coffee/Heater;", "pump", "Lcom/learning/learningapp2022/ganeshhegde/di/coffee/Pump;", "(Lcom/learning/learningapp2022/ganeshhegde/di/coffee/Heater;Lcom/learning/learningapp2022/ganeshhegde/di/coffee/Pump;)V", "getHeater", "()Lcom/learning/learningapp2022/ganeshhegde/di/coffee/Heater;", "getPump", "()Lcom/learning/learningapp2022/ganeshhegde/di/coffee/Pump;", "brew", "", "app_debug"})
public final class CoffeeMaker {
    @org.jetbrains.annotations.NotNull()
    private final com.learning.learningapp2022.ganeshhegde.di.coffee.Heater heater = null;
    @org.jetbrains.annotations.NotNull()
    private final com.learning.learningapp2022.ganeshhegde.di.coffee.Pump pump = null;
    
    @javax.inject.Inject()
    public CoffeeMaker(@org.jetbrains.annotations.NotNull()
    com.learning.learningapp2022.ganeshhegde.di.coffee.Heater heater, @org.jetbrains.annotations.NotNull()
    com.learning.learningapp2022.ganeshhegde.di.coffee.Pump pump) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.learning.learningapp2022.ganeshhegde.di.coffee.Heater getHeater() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.learning.learningapp2022.ganeshhegde.di.coffee.Pump getPump() {
        return null;
    }
    
    public final void brew() {
    }
}