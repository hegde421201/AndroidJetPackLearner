package com.learning.learningapp2022.ganeshhegde.di.coffee;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class Pump_Factory implements Factory<Pump> {
  private final Provider<Thermosiphon> thermosiphonProvider;

  public Pump_Factory(Provider<Thermosiphon> thermosiphonProvider) {
    this.thermosiphonProvider = thermosiphonProvider;
  }

  @Override
  public Pump get() {
    return newInstance(thermosiphonProvider.get());
  }

  public static Pump_Factory create(Provider<Thermosiphon> thermosiphonProvider) {
    return new Pump_Factory(thermosiphonProvider);
  }

  public static Pump newInstance(Thermosiphon thermosiphon) {
    return new Pump(thermosiphon);
  }
}
