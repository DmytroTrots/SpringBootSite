package com.SpringSiteGOSH.HomeworkDatabase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface homeworkAddDatabaseRepository extends JpaRepository<homeworkAddDatabase, Long> {
   @Query("SELECT h FROM homeworkAddDatabase h WHERE h.login= :login and h.deadline > :date and h.subject= :subject")
   List<homeworkAddDatabase> findByLoginAndDeadlineAndSubject(@Param("login") String login, @Param("date") String date, @Param("subject") String subject);
}

