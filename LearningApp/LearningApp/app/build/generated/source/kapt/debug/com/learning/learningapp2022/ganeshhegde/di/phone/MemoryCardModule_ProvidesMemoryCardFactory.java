package com.learning.learningapp2022.ganeshhegde.di.phone;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class MemoryCardModule_ProvidesMemoryCardFactory implements Factory<MemoryCard> {
  private final MemoryCardModule module;

  public MemoryCardModule_ProvidesMemoryCardFactory(MemoryCardModule module) {
    this.module = module;
  }

  @Override
  public MemoryCard get() {
    return providesMemoryCard(module);
  }

  public static MemoryCardModule_ProvidesMemoryCardFactory create(MemoryCardModule module) {
    return new MemoryCardModule_ProvidesMemoryCardFactory(module);
  }

  public static MemoryCard providesMemoryCard(MemoryCardModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesMemoryCard());
  }
}
