package com.SpringSiteGOSH.Services;

import com.SpringSiteGOSH.Entities.UsersEntity;
import com.SpringSiteGOSH.Repositories.CustomUserDetails;
import com.SpringSiteGOSH.Repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UsersRepository repository;

    public List<UsersEntity> listAllUsers(){
        return repository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        UsersEntity usersEntity = repository.findByLogin(login);
        if(usersEntity == null){
            throw new UsernameNotFoundException("Login does not exist");
        }
        return new CustomUserDetails(usersEntity);
    }
}
