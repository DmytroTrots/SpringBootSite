package com.SpringSiteGOSH.HomeworkDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class homeworkAddService {

    @Autowired
    private homeworkAddDatabaseRepository homeworkAddDatabaseRepository;

    public List<homeworkAddDatabase> getHomeworkTasks(String login, String date, String subject){
        return homeworkAddDatabaseRepository.findByLoginAndDeadlineAndSubject(login, date, subject);
    }
}
