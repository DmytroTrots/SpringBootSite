package com.SpringSiteGOSH.SubjectsServices;

import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g9;
import com.SpringSiteGOSH.DatabaseSubjects.f_fit_c2g9Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class f_fit_c2g9Service {

    @Autowired
    private f_fit_c2g9Repository f_fit_c2g9Repository;

    public List<f_fit_c2g9> listAllSubjects(){
        return f_fit_c2g9Repository.findAll();
    }

    public f_fit_c2g9 getSubjectById(Long id_f_fit_c2g9){
        return (f_fit_c2g9) f_fit_c2g9Repository.findAllById(Collections.singleton(id_f_fit_c2g9));
    }
}
