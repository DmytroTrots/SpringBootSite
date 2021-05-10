package com.SpringSiteGOSH.HomeworkDatabase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface homeworkSubjectsRepository extends JpaRepository<homeworkSubjects, Long> {
    @Query("SELECT s FROM homeworkSubjects s WHERE s.courseofstudent= :course and s.groupofstudent= :groupofstudent")
    List<homeworkSubjects> findByCourseofstudentAndGroupofstudent(@Param("course") int course, @Param("groupofstudent") int groupofstudent);
}
