package com.SpringSiteGOSH;

import com.SpringSiteGOSH.DatabaseUsers.User;
import com.SpringSiteGOSH.DatabaseUsers.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        User user = new User();
        user.setEmail("dtrots27@gmail.com");
        user.setFirstname("Дмитрий");
        user.setSurname("Троц");
        user.setCourse(2);
        user.setFaculty("ФИТ");
        user.setFathersname("Петрович");
        user.setLogin("Roiten");
        user.setPassword("DimaDima272727");
        user.setGroupofstudent(9);
        User savedUser = repository.save(user);
        User existedUser = entityManager.find(User.class, savedUser.getId());
        assert(existedUser.getEmail().equals(user.getEmail()));
    }

    @Test
    public void testFindUserByLogin(){
        String login = "DmytroT1rots";
        User user = repository.findByLogin(login);
    }
}
