package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g7;
import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class f_fit_c2g7Service {

    @Autowired
    private f_fit_c2g7Repository f_fit_c2g7Repository;

    public List<f_fit_c2g7> listAllSubjects(){
        return f_fit_c2g7Repository.findAll();
    }

    public f_fit_c2g7 getSubjectById(Long id_f_fit_c2g7){
        return (f_fit_c2g7) f_fit_c2g7Repository.findAllById(Collections.singleton(id_f_fit_c2g7));
    }
}

