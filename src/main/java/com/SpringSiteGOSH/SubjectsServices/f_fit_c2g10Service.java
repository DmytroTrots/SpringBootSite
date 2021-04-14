package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g10;
import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g10Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class f_fit_c2g10Service {

    @Autowired
    private f_fit_c2g10Repository f_fit_c2g10Repository;

    public List<f_fit_c2g10> listAllSubjects(){
        return f_fit_c2g10Repository.findAll();
    }

    public f_fit_c2g10 getSubjectById(Long id_f_fit_c2g10){
        return (f_fit_c2g10) f_fit_c2g10Repository.findAllById(Collections.singleton(id_f_fit_c2g10));
    }
}

