package com.learning.springsecurityjwt.beans;

import lombok.Data;

@Data
public class JwtResponse {
    private  String jwtToken;

    public JwtResponse(String token) {
        this.jwtToken=token;
    }
}
