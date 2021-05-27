package com.SpringSiteGOSH.DatabaseUsers;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {
    private final User user;

    public CustomUserDetails(User user) {
        this.user = user;
    }

    public int course(){
        return user.getCourse();
    }

    public int groupofstudent(){
        return user.getGroupofstudent();
    }
    public String email(){
        return user.getEmail();
    }
    public String firstname(){
        return user.getFirstname();
    }
    public String surname(){
        return user.getSurname();
    }
    public String faculty(){
        return user.getFaculty();
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getLogin();
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
