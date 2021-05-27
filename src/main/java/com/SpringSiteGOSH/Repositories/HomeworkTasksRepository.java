package com.SpringSiteGOSH.Repositories;

import com.SpringSiteGOSH.Entities.HomeworkTasksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeworkTasksRepository extends JpaRepository<HomeworkTasksEntity, Long> {
   @Query("SELECT h FROM HomeworkTasksEntity h WHERE h.login= :login and h.deadline > :date and h.subject= :subject")
   List<HomeworkTasksEntity> findByLoginAndDeadlineAndSubject(@Param("login") String login, @Param("date") String date, @Param("subject") String subject);
}

