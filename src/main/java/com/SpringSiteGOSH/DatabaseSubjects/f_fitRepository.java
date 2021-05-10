package com.SpringSiteGOSH.DatabaseSubjects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface f_fitRepository extends JpaRepository<f_fit, Long> {
    @Query("SELECT f FROM f_fit f WHERE f.courseofstudent= :course and f.groupofstudent= :groupofstudent")
    List<f_fit> findByGroupofstudentAndCourseofstudent(@Param("course") int course, @Param("groupofstudent") int groupofstudent);
}
