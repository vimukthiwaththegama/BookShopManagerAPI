package com.BookShopManager.BookShopManager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @Override
    public String toString(){
        return "UserDto{" +
                "userId='" + id + '\'' +
                ", userFirstName='" + firstName + '\'' +
                ", userLastName='" + lastName + '\'' +
                ",userEmail='" + email +'\'' +
                ", userPassword='" + password +
                '}';
    }
}
