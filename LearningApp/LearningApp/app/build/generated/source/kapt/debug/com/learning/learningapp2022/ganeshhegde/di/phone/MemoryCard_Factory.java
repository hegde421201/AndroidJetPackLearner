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
public final class MemoryCard_Factory implements Factory<MemoryCard> {
  @Override
  public MemoryCard get() {
    return newInstance();
  }

  public static MemoryCard_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MemoryCard newInstance() {
    return new MemoryCard();
  }

  private static final class InstanceHolder {
    private static final MemoryCard_Factory INSTANCE = new MemoryCard_Factory();
  }
}
