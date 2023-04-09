package com.learning.learningapp2022.ganeshhegde.di.phone;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DIActivity_MembersInjector implements MembersInjector<DIActivity> {
  private final Provider<SmartPhone> smartPhoneProvider;

  public DIActivity_MembersInjector(Provider<SmartPhone> smartPhoneProvider) {
    this.smartPhoneProvider = smartPhoneProvider;
  }

  public static MembersInjector<DIActivity> create(Provider<SmartPhone> smartPhoneProvider) {
    return new DIActivity_MembersInjector(smartPhoneProvider);
  }

  @Override
  public void injectMembers(DIActivity instance) {
    injectSmartPhone(instance, smartPhoneProvider.get());
  }

  @InjectedFieldSignature("com.learning.learningapp2022.ganeshhegde.di.phone.DIActivity.smartPhone")
  public static void injectSmartPhone(DIActivity instance, SmartPhone smartPhone) {
    instance.smartPhone = smartPhone;
  }
}
