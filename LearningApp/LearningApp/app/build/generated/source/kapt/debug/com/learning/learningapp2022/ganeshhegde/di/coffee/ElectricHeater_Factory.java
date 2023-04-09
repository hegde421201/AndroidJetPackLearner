package com.learning.learningapp2022.ganeshhegde.di.coffee;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ElectricHeater_Factory implements Factory<ElectricHeater> {
  @Override
  public ElectricHeater get() {
    return newInstance();
  }

  public static ElectricHeater_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ElectricHeater newInstance() {
    return new ElectricHeater();
  }

  private static final class InstanceHolder {
    private static final ElectricHeater_Factory INSTANCE = new ElectricHeater_Factory();
  }
}
