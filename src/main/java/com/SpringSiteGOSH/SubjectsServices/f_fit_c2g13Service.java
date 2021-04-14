package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g13;
import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g13Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class f_fit_c2g13Service {

    @Autowired
    private f_fit_c2g13Repository f_fit_c2g13Repository;

    public List<f_fit_c2g13> listAllSubjects(){
        return f_fit_c2g13Repository.findAll();
    }

    public f_fit_c2g13 getSubjectById(Long id_f_fit_c2g13){
        return (f_fit_c2g13) f_fit_c2g13Repository.findAllById(Collections.singleton(id_f_fit_c2g13));
    }
}

