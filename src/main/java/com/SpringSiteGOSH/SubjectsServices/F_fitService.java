package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class F_fitService {

    @Autowired
    private com.SpringSiteGOSH.DatabaseSubjects.f_fitRepository f_fitRepository;

    public List<f_fit> getSubjectByGroupAndCourse(int course, int groupofstudent){
        return f_fitRepository.findByGroupofstudentAndCourseofstudent(course, groupofstudent);
    }
}
