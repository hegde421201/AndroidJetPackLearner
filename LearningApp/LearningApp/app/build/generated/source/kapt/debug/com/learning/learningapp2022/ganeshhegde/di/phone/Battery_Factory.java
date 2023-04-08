package com.learning.learningapp2022.ganeshhegde.di.phone;

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
public final class Battery_Factory implements Factory<Battery> {
  @Override
  public Battery get() {
    return newInstance();
  }

  public static Battery_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Battery newInstance() {
    return new Battery();
  }

  private static final class InstanceHolder {
    private static final Battery_Factory INSTANCE = new Battery_Factory();
  }
}
