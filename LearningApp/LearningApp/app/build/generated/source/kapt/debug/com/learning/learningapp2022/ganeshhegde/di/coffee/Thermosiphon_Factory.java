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
public final class Thermosiphon_Factory implements Factory<Thermosiphon> {
  private final Provider<ElectricHeater> heaterProvider;

  public Thermosiphon_Factory(Provider<ElectricHeater> heaterProvider) {
    this.heaterProvider = heaterProvider;
  }

  @Override
  public Thermosiphon get() {
    return newInstance(heaterProvider.get());
  }

  public static Thermosiphon_Factory create(Provider<ElectricHeater> heaterProvider) {
    return new Thermosiphon_Factory(heaterProvider);
  }

  public static Thermosiphon newInstance(ElectricHeater heater) {
    return new Thermosiphon(heater);
  }
}
