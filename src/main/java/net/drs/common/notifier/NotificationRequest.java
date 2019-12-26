package net.drs.common.notifier;

import java.io.Serializable;

public class NotificationRequest  implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 2358050464685162683L;
    
    private Long notificationId;

    private String emailid;
    
    private String template;
    
    private NotificationType notificationType = NotificationType.EMAIL; // by default
        
    public NotificationRequest(Long notificationId, String emailid, String template,String notificationType) {
        super();
        this.notificationId = notificationId;
        this.emailid = emailid;
        this.template = template;
        this.notificationType=NotificationType.valueOf(notificationType);
    }

    public NotificationRequest() {
        super();
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }


    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }
    
    
    public String getNotificationType() {
        return notificationType.getNotificationDisplayName();
    }
}
