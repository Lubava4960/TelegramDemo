package com.example.telegramdemo.entity;


import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "notification_task ")
public class NotificationTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
    @Column(nullable = false)
    private String massage;
    @Column(name="chat_id",nullable = false)
    private long chatId;
    @Column(name="notification_date_time", nullable = false)
    private LocalDateTime notificationDateTime;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public LocalDateTime getNotificationDateTime() {
        return notificationDateTime;
    }

    public void setNotificationDateTime(LocalDateTime notificationDateTime) {
        this.notificationDateTime = notificationDateTime;
    }

}
