package com.learning.learningapp2022.ganeshhegde.di.coffee;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class CoffeeMaker_Factory implements Factory<CoffeeMaker> {
  private final Provider<Heater> heaterProvider;

  private final Provider<Pump> pumpProvider;

  public CoffeeMaker_Factory(Provider<Heater> heaterProvider, Provider<Pump> pumpProvider) {
    this.heaterProvider = heaterProvider;
    this.pumpProvider = pumpProvider;
  }

  @Override
  public CoffeeMaker get() {
    return newInstance(heaterProvider.get(), pumpProvider.get());
  }

  public static CoffeeMaker_Factory create(Provider<Heater> heaterProvider,
      Provider<Pump> pumpProvider) {
    return new CoffeeMaker_Factory(heaterProvider, pumpProvider);
  }

  public static CoffeeMaker newInstance(Heater heater, Pump pump) {
    return new CoffeeMaker(heater, pump);
  }
}
