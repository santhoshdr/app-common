package net.drs.common.notifier;

public enum NotificationType {

    EMAIL("EMAIL", "Email"), SMS("SMS", "SMS");

    private String notificationType;

    private String notificationDisplayName;

    private NotificationType(String notificationType, String notificationDisyplayName) {
        this.notificationType = notificationType;
        this.notificationDisplayName = notificationDisyplayName;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public String getNotificationDisplayName() {
        return notificationDisplayName;
    }
}
