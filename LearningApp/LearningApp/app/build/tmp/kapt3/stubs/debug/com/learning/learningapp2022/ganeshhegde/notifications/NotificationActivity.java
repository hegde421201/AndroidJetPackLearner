package com.learning.learningapp2022.ganeshhegde.notifications;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/learning/learningapp2022/ganeshhegde/notifications/NotificationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "KEY_REPLY", "", "channelID", "notificationManager", "Landroid/app/NotificationManager;", "createNotificationChannel", "", "id", "name", "channelDescription", "displayNotification", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class NotificationActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String channelID = "com.learning.learningapp2022.ganeshhegde.notifications.channel1";
    @org.jetbrains.annotations.Nullable
    private android.app.NotificationManager notificationManager;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String KEY_REPLY = "reply_key";
    
    public NotificationActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void displayNotification() {
    }
    
    private final void createNotificationChannel(java.lang.String id, java.lang.String name, java.lang.String channelDescription) {
    }
}