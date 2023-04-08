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
public final class SmartPhone_Factory implements Factory<SmartPhone> {
  private final Provider<Battery> batteryProvider;

  private final Provider<SimCard> simCardProvider;

  private final Provider<MemoryCard> memoryCardProvider;

  public SmartPhone_Factory(Provider<Battery> batteryProvider, Provider<SimCard> simCardProvider,
      Provider<MemoryCard> memoryCardProvider) {
    this.batteryProvider = batteryProvider;
    this.simCardProvider = simCardProvider;
    this.memoryCardProvider = memoryCardProvider;
  }

  @Override
  public SmartPhone get() {
    return newInstance(batteryProvider.get(), simCardProvider.get(), memoryCardProvider.get());
  }

  public static SmartPhone_Factory create(Provider<Battery> batteryProvider,
      Provider<SimCard> simCardProvider, Provider<MemoryCard> memoryCardProvider) {
    return new SmartPhone_Factory(batteryProvider, simCardProvider, memoryCardProvider);
  }

  public static SmartPhone newInstance(Battery battery, SimCard simCard, MemoryCard memoryCard) {
    return new SmartPhone(battery, simCard, memoryCard);
  }
}
