package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g8;
import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g8Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class f_fit_c2g8Service {

    @Autowired
    private f_fit_c2g8Repository f_fit_c2g8Repository;

    public List<f_fit_c2g8> listAllSubjects(){
        return f_fit_c2g8Repository.findAll();
    }

    public f_fit_c2g8 getSubjectById(Long id_f_fit_c2g8){
        return (f_fit_c2g8) f_fit_c2g8Repository.findAllById(Collections.singleton(id_f_fit_c2g8));
    }
}

