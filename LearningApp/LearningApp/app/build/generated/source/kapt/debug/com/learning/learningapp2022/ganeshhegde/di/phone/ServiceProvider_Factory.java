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
public final class ServiceProvider_Factory implements Factory<ServiceProvider> {
  @Override
  public ServiceProvider get() {
    return newInstance();
  }

  public static ServiceProvider_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ServiceProvider newInstance() {
    return new ServiceProvider();
  }

  private static final class InstanceHolder {
    private static final ServiceProvider_Factory INSTANCE = new ServiceProvider_Factory();
  }
}
