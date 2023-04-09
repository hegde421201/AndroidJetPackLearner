package com.learning.learningapp2022.ganeshhegde.di.coffee;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerCoffeeMakerComponent {
  private DaggerCoffeeMakerComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CoffeeMakerComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    public CoffeeMakerComponent build() {
      return new CoffeeMakerComponentImpl();
    }
  }

  private static final class CoffeeMakerComponentImpl implements CoffeeMakerComponent {
    private final CoffeeMakerComponentImpl coffeeMakerComponentImpl = this;

    private Provider<Thermosiphon> thermosiphonProvider;

    private Provider<Pump> pumpProvider;

    private Provider<CoffeeMaker> coffeeMakerProvider;

    private CoffeeMakerComponentImpl() {

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.thermosiphonProvider = Thermosiphon_Factory.create(ElectricHeater_Factory.create());
      this.pumpProvider = Pump_Factory.create(thermosiphonProvider);
      this.coffeeMakerProvider = DoubleCheck.provider(CoffeeMaker_Factory.create(((Provider) ElectricHeater_Factory.create()), pumpProvider));
    }

    @Override
    public void inject(CoffeeActivity coffeeActivity) {
      injectCoffeeActivity(coffeeActivity);
    }

    private CoffeeActivity injectCoffeeActivity(CoffeeActivity instance) {
      CoffeeActivity_MembersInjector.injectCoffeeMaker(instance, coffeeMakerProvider.get());
      return instance;
    }
  }
}
