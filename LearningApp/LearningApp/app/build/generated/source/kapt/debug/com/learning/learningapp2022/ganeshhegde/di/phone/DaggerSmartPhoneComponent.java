package com.learning.learningapp2022.ganeshhegde.di.phone;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
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
public final class DaggerSmartPhoneComponent {
  private DaggerSmartPhoneComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private MemoryCardModule memoryCardModule;

    private Builder() {
    }

    public Builder memoryCardModule(MemoryCardModule memoryCardModule) {
      this.memoryCardModule = Preconditions.checkNotNull(memoryCardModule);
      return this;
    }

    public SmartPhoneComponent build() {
      Preconditions.checkBuilderRequirement(memoryCardModule, MemoryCardModule.class);
      return new SmartPhoneComponentImpl(memoryCardModule);
    }
  }

  private static final class SmartPhoneComponentImpl implements SmartPhoneComponent {
    private final SmartPhoneComponentImpl smartPhoneComponentImpl = this;

    private Provider<SimCard> simCardProvider;

    private Provider<MemoryCard> providesMemoryCardProvider;

    private Provider<SmartPhone> smartPhoneProvider;

    private SmartPhoneComponentImpl(MemoryCardModule memoryCardModuleParam) {

      initialize(memoryCardModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final MemoryCardModule memoryCardModuleParam) {
      this.simCardProvider = SimCard_Factory.create(ServiceProvider_Factory.create());
      this.providesMemoryCardProvider = MemoryCardModule_ProvidesMemoryCardFactory.create(memoryCardModuleParam);
      this.smartPhoneProvider = DoubleCheck.provider(SmartPhone_Factory.create(Battery_Factory.create(), simCardProvider, providesMemoryCardProvider));
    }

    @Override
    public void inject(DIActivity diActivity) {
      injectDIActivity(diActivity);
    }

    private DIActivity injectDIActivity(DIActivity instance) {
      DIActivity_MembersInjector.injectSmartPhone(instance, smartPhoneProvider.get());
      return instance;
    }
  }
}
