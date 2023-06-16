package com.learning.learningapp2022.ganeshhegde.di.coffee;

@javax.inject.Singleton()
@dagger.Component(modules = {com.learning.learningapp2022.ganeshhegde.di.coffee.ElectricHeaterModule.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/di/coffee/CoffeeMakerComponent;", "", "inject", "", "coffeeActivity", "Lcom/learning/learningapp2022/ganeshhegde/di/coffee/CoffeeActivity;", "app_debug"})
public abstract interface CoffeeMakerComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.learning.learningapp2022.ganeshhegde.di.coffee.CoffeeActivity coffeeActivity);
}