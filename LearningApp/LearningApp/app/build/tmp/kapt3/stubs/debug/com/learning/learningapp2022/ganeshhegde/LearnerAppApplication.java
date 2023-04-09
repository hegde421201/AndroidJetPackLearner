package com.learning.learningapp2022.ganeshhegde;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/LearnerAppApplication;", "Landroid/app/Application;", "()V", "coffeeMakerComponent", "Lcom/learning/learningapp2022/ganeshhegde/di/coffee/CoffeeMakerComponent;", "getCoffeeMakerComponent", "()Lcom/learning/learningapp2022/ganeshhegde/di/coffee/CoffeeMakerComponent;", "setCoffeeMakerComponent", "(Lcom/learning/learningapp2022/ganeshhegde/di/coffee/CoffeeMakerComponent;)V", "smartPhoneComponent", "Lcom/learning/learningapp2022/ganeshhegde/di/phone/SmartPhoneComponent;", "getSmartPhoneComponent", "()Lcom/learning/learningapp2022/ganeshhegde/di/phone/SmartPhoneComponent;", "setSmartPhoneComponent", "(Lcom/learning/learningapp2022/ganeshhegde/di/phone/SmartPhoneComponent;)V", "initDagger", "initDaggerCoffee", "onCreate", "", "app_debug"})
public final class LearnerAppApplication extends android.app.Application {
    public com.learning.learningapp2022.ganeshhegde.di.phone.SmartPhoneComponent smartPhoneComponent;
    public com.learning.learningapp2022.ganeshhegde.di.coffee.CoffeeMakerComponent coffeeMakerComponent;
    
    public LearnerAppApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.learning.learningapp2022.ganeshhegde.di.phone.SmartPhoneComponent getSmartPhoneComponent() {
        return null;
    }
    
    public final void setSmartPhoneComponent(@org.jetbrains.annotations.NotNull()
    com.learning.learningapp2022.ganeshhegde.di.phone.SmartPhoneComponent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.learning.learningapp2022.ganeshhegde.di.coffee.CoffeeMakerComponent getCoffeeMakerComponent() {
        return null;
    }
    
    public final void setCoffeeMakerComponent(@org.jetbrains.annotations.NotNull()
    com.learning.learningapp2022.ganeshhegde.di.coffee.CoffeeMakerComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final com.learning.learningapp2022.ganeshhegde.di.phone.SmartPhoneComponent initDagger() {
        return null;
    }
    
    private final com.learning.learningapp2022.ganeshhegde.di.coffee.CoffeeMakerComponent initDaggerCoffee() {
        return null;
    }
}