package com.learning.learningapp2022.ganeshhegde.di.coffee;

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
public final class CoffeeActivity_MembersInjector implements MembersInjector<CoffeeActivity> {
  private final Provider<CoffeeMaker> coffeeMakerProvider;

  public CoffeeActivity_MembersInjector(Provider<CoffeeMaker> coffeeMakerProvider) {
    this.coffeeMakerProvider = coffeeMakerProvider;
  }

  public static MembersInjector<CoffeeActivity> create(Provider<CoffeeMaker> coffeeMakerProvider) {
    return new CoffeeActivity_MembersInjector(coffeeMakerProvider);
  }

  @Override
  public void injectMembers(CoffeeActivity instance) {
    injectCoffeeMaker(instance, coffeeMakerProvider.get());
  }

  @InjectedFieldSignature("com.learning.learningapp2022.ganeshhegde.di.coffee.CoffeeActivity.coffeeMaker")
  public static void injectCoffeeMaker(CoffeeActivity instance, CoffeeMaker coffeeMaker) {
    instance.coffeeMaker = coffeeMaker;
  }
}
