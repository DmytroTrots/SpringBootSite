package com.SpringSiteGOSH.Services;

import com.SpringSiteGOSH.Entities.FiveSubjectsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiveSubjectsService {
    @Autowired
    private com.SpringSiteGOSH.Repositories.homeworkSubjectsRepository homeworkSubjectsRepository;

    public List<FiveSubjectsEntity> getHomeworkSubjects(int course, int groupofstudent){
        return homeworkSubjectsRepository.findByCourseofstudentAndGroupofstudent(course, groupofstudent);
    }
}
