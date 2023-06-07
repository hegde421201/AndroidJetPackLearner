package com.learning.learningapp2022.ganeshhegde.retrofit.kotlin;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/retrofit/kotlin/AlbumService;", "", "getAlbum", "Lretrofit2/Response;", "Lcom/learning/learningapp2022/ganeshhegde/retrofit/kotlin/AlbumsItem;", "albumId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlbums", "Lcom/learning/learningapp2022/ganeshhegde/retrofit/kotlin/Albums;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSortedAlbums", "userId", "uploadAlbum", "album", "(Lcom/learning/learningapp2022/ganeshhegde/retrofit/kotlin/AlbumsItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AlbumService {
    
    @retrofit2.http.GET(value = "/albums")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAlbums(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.learning.learningapp2022.ganeshhegde.retrofit.kotlin.Albums>> $completion);
    
    @retrofit2.http.GET(value = "/albums")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getSortedAlbums(@retrofit2.http.Query(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.learning.learningapp2022.ganeshhegde.retrofit.kotlin.Albums>> $completion);
    
    @retrofit2.http.GET(value = "/albums/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAlbum(@retrofit2.http.Path(value = "id")
    int albumId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.learning.learningapp2022.ganeshhegde.retrofit.kotlin.AlbumsItem>> $completion);
    
    @retrofit2.http.POST(value = "/albums")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object uploadAlbum(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.learning.learningapp2022.ganeshhegde.retrofit.kotlin.AlbumsItem album, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.learning.learningapp2022.ganeshhegde.retrofit.kotlin.AlbumsItem>> $completion);
}