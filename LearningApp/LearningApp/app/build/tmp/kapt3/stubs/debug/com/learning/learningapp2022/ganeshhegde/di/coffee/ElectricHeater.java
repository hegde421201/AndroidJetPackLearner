package com.learning.learningapp2022.ganeshhegde.di.coffee;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/di/coffee/ElectricHeater;", "Lcom/learning/learningapp2022/ganeshhegde/di/coffee/Heater;", "()V", "isHot", "", "off", "", "on", "app_debug"})
public final class ElectricHeater implements com.learning.learningapp2022.ganeshhegde.di.coffee.Heater {
    
    @javax.inject.Inject
    public ElectricHeater() {
        super();
    }
    
    @java.lang.Override
    public boolean isHot() {
        return false;
    }
    
    @java.lang.Override
    public void on() {
    }
    
    @java.lang.Override
    public void off() {
    }
}