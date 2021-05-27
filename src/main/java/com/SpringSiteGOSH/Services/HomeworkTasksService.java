package com.SpringSiteGOSH.Services;

import com.SpringSiteGOSH.Entities.HomeworkTasksEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkTasksService {

    @Autowired
    private com.SpringSiteGOSH.Repositories.HomeworkTasksRepository HomeworkTasksRepository;

    public List<HomeworkTasksEntity> getHomeworkTasks(String login, String date, String subject){
        return HomeworkTasksRepository.findByLoginAndDeadlineAndSubject(login, date, subject);
    }
}
