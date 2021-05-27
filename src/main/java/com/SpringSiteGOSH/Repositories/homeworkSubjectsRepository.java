package com.SpringSiteGOSH.Repositories;

import com.SpringSiteGOSH.Entities.FiveSubjectsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface homeworkSubjectsRepository extends JpaRepository<FiveSubjectsEntity, Long> {
    @Query("SELECT s FROM FiveSubjectsEntity s WHERE s.courseofstudent= :course and s.groupofstudent= :groupofstudent")
    List<FiveSubjectsEntity> findByCourseofstudentAndGroupofstudent(@Param("course") int course, @Param("groupofstudent") int groupofstudent);
}
