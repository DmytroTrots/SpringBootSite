package com.SpringSiteGOSH.Repositories;

import com.SpringSiteGOSH.Entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
    @Query("SELECT u FROM UsersEntity u WHERE u.login = ?1")
    UsersEntity findByLogin(String login);
}
