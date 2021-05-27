package com.SpringSiteGOSH.Repositories;

import com.SpringSiteGOSH.Entities.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Long> {
    @Query("SELECT f FROM ScheduleEntity f WHERE f.courseofstudent= :course and f.groupofstudent= :groupofstudent")
    List<ScheduleEntity> findByGroupofstudentAndCourseofstudent(@Param("course") int course, @Param("groupofstudent") int groupofstudent);
}
