package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g6;
import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g6Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class f_fit_c2g6Service {

    @Autowired
    private f_fit_c2g6Repository f_fit_c2g6Repository;

    public List<f_fit_c2g6> listAllSubjects(){
        return f_fit_c2g6Repository.findAll();
    }

    public f_fit_c2g6 getSubjectById(Long id_f_fit_c2g6){
        return (f_fit_c2g6) f_fit_c2g6Repository.findAllById(Collections.singleton(id_f_fit_c2g6));
    }
}

