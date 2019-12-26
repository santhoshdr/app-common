package net.drs.common.notifier;

import java.io.Serializable;
import java.util.Map;

public class NotificationRequest implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2358050464685162683L;

    private Long notificationId;

    private String emailid;

    private String phoneNumber;

    private String template;
    
    private Map<String,String> message;

    private NotificationType notificationType = NotificationType.EMAIL; // by
                                                                        // default

    public NotificationRequest(Long notificationId, String emailid, String phoneNumber, Map<String,String> message , NotificationTemplate notificationTemplate, NotificationType notificationType) {
        super();
        this.notificationId = notificationId;
        this.emailid = emailid;
        this.message = message;
        this.notificationType = notificationType;
        this.phoneNumber = phoneNumber;
    }

    public NotificationRequest() {
        super();
    }
    
    public Map<String,String> getMessage(){
        return message;
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
        return notificationType.getNotificationType();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
