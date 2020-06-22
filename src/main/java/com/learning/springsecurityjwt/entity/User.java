package com.learning.springsecurityjwt.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_details_jwt")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    public User(String userName,String password)
    {
        this.userName=userName;
        this.password=password;
    }
}
