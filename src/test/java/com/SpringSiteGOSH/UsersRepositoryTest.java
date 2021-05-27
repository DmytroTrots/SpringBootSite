package com.SpringSiteGOSH;

import com.SpringSiteGOSH.Entities.UsersEntity;
import com.SpringSiteGOSH.Repositories.UsersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UsersRepositoryTest {

    @Autowired
    private UsersRepository repository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setEmail("dtrots27@gmail.com");
        usersEntity.setFirstname("Дмитрий");
        usersEntity.setSurname("Троц");
        usersEntity.setCourse(2);
        usersEntity.setFaculty("ФИТ");
        usersEntity.setFathersname("Петрович");
        usersEntity.setLogin("Roiten");
        usersEntity.setPassword("DimaDima272727");
        usersEntity.setGroupofstudent(9);
        UsersEntity savedUsersEntity = repository.save(usersEntity);
        UsersEntity existedUsersEntity = entityManager.find(UsersEntity.class, savedUsersEntity.getId());
        assert(existedUsersEntity.getEmail().equals(usersEntity.getEmail()));
    }

    @Test
    public void testFindUserByLogin(){
        String login = "DmytroT1rots";
        UsersEntity usersEntity = repository.findByLogin(login);
    }
}
