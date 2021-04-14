package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g11;
import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g11Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class f_fit_c2g11Service {

    @Autowired
    private f_fit_c2g11Repository f_fit_c2g11Repository;

    public List<f_fit_c2g11> listAllSubjects(){
        return f_fit_c2g11Repository.findAll();
    }

    public f_fit_c2g11 getSubjectById(Long id_f_fit_c2g11){
        return (f_fit_c2g11) f_fit_c2g11Repository.findAllById(Collections.singleton(id_f_fit_c2g11));
    }
}

