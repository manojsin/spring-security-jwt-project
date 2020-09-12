package com.learning.springsecurityjwt.beans;

import lombok.Data;

@Data
public class JwtResponse {
    private  String jwtToken;
    private boolean status;
    private String message;

    public JwtResponse(String token) {
        this.jwtToken=token;
        this.status=true;
        this.message="Successfully generate jwt token";
    }
}
