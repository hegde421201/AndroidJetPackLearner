package com.learning.learningapp2022.ganeshhegde.di.phone;

import dagger.internal.DaggerGenerated;
import javax.annotation.processing.Generated;

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

  public static SmartPhoneComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    public SmartPhoneComponent build() {
      return new SmartPhoneComponentImpl();
    }
  }

  private static final class SmartPhoneComponentImpl implements SmartPhoneComponent {
    private final SmartPhoneComponentImpl smartPhoneComponentImpl = this;

    private SmartPhoneComponentImpl() {


    }

    private SimCard simCard() {
      return new SimCard(new ServiceProvider());
    }

    @Override
    public SmartPhone getSmartPhone() {
      return new SmartPhone(new Battery(), simCard(), new MemoryCard());
    }
  }
}
