package com.learning.learningapp2022.ganeshhegde.di.phone;

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
public final class SimCard_Factory implements Factory<SimCard> {
  private final Provider<ServiceProvider> serviceProvider;

  public SimCard_Factory(Provider<ServiceProvider> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public SimCard get() {
    return newInstance(serviceProvider.get());
  }

  public static SimCard_Factory create(Provider<ServiceProvider> serviceProvider) {
    return new SimCard_Factory(serviceProvider);
  }

  public static SimCard newInstance(ServiceProvider serviceProvider) {
    return new SimCard(serviceProvider);
  }
}
