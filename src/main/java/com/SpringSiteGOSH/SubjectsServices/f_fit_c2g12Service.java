package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g12;
import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g12Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class f_fit_c2g12Service {

    @Autowired
    private f_fit_c2g12Repository f_fit_c2g12Repository;

    public List<f_fit_c2g12> listAllSubjects(){
        return f_fit_c2g12Repository.findAll();
    }

    public f_fit_c2g12 getSubjectById(Long id_f_fit_c2g12){
        return (f_fit_c2g12) f_fit_c2g12Repository.findAllById(Collections.singleton(id_f_fit_c2g12));
    }
}

