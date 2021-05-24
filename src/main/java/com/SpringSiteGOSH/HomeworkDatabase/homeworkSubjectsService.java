package com.SpringSiteGOSH.HomeworkDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class homeworkSubjectsService {
    @Autowired
    private homeworkSubjectsRepository homeworkSubjectsRepository;

    public List<homeworkSubjects> getHomeworkSubjects(int course, int groupofstudent){
        return homeworkSubjectsRepository.findByCourseofstudentAndGroupofstudent(course, groupofstudent);
    }




}
