package com.SpringSiteGOSH.Services;

import com.SpringSiteGOSH.Entities.ScheduleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private com.SpringSiteGOSH.Repositories.ScheduleRepository scheduleRepository;

    public List<ScheduleEntity> getSubjectByGroupAndCourse(int course, int groupofstudent){
        return scheduleRepository.findByGroupofstudentAndCourseofstudent(course, groupofstudent);
    }
}
