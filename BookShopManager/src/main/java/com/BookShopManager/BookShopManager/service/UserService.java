package com.BookShopManager.BookShopManager.service;

import com.BookShopManager.BookShopManager.dto.UserDto;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;

public interface UserService {
    void saveUser(UserDto userDto);
    void updateUser(UserDto userDto);
    void deleteUser(Integer id);
    UserDto getUser(Integer id);
    ArrayList<UserDto> getAllUsers();
}
