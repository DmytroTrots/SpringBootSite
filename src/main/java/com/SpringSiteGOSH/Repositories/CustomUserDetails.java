package com.SpringSiteGOSH.Repositories;

import com.SpringSiteGOSH.Entities.UsersEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {
    private final UsersEntity usersEntity;

    public CustomUserDetails(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }

    public int course(){
        return usersEntity.getCourse();
    }

    public int groupofstudent(){
        return usersEntity.getGroupofstudent();
    }
    public String email(){
        return usersEntity.getEmail();
    }
    public String firstname(){
        return usersEntity.getFirstname();
    }
    public String surname(){
        return usersEntity.getSurname();
    }
    public String faculty(){
        return usersEntity.getFaculty();
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return usersEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return usersEntity.getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
