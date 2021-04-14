package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g1;
import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class f_fit_c2g1Service {

    @Autowired
    private f_fit_c2g1Repository f_fit_c2g1Repository;

    public List<f_fit_c2g1> listAllSubjects(){
        return f_fit_c2g1Repository.findAll();
    }

    public f_fit_c2g1 getSubjectById(Long id_f_fit_c2g1){
        return (f_fit_c2g1) f_fit_c2g1Repository.findAllById(Collections.singleton(id_f_fit_c2g1));
    }
}
