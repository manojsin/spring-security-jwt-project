package com.learning.springsecurityjwt.beans;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String userName;
    private String password;

}
