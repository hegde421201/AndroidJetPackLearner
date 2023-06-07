package com.learning.learningapp2022.ganeshhegde.di.phone;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/di/phone/MemoryCardModule;", "", "memorySize", "", "(I)V", "getMemorySize", "()I", "providesMemoryCard", "Lcom/learning/learningapp2022/ganeshhegde/di/phone/MemoryCard;", "app_debug"})
public final class MemoryCardModule {
    private final int memorySize = 0;
    
    public MemoryCardModule(int memorySize) {
        super();
    }
    
    public final int getMemorySize() {
        return 0;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.learning.learningapp2022.ganeshhegde.di.phone.MemoryCard providesMemoryCard() {
        return null;
    }
}