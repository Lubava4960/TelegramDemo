package com.example.telegramdemo.service;

import com.example.telegramdemo.entity.NotificationTask;
import com.example.telegramdemo.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;



    @Service

    public class NotificationTaskService {
        private final NotificationTaskRepository notificationTaskRepository;


        public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
            this.notificationTaskRepository = notificationTaskRepository;
        }
        public void save(NotificationTask notificationTask){
            notificationTaskRepository.save(notificationTask);
        }



    }



