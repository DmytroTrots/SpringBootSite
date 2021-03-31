package com.SpringSiteGOSH;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "DimaDima272727";
        String encodedPass = encoder.encode(rawPassword);
        System.out.println(encodedPass);
    }
}
