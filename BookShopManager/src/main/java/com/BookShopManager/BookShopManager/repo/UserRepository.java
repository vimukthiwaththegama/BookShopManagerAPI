package com.BookShopManager.BookShopManager.repo;

import com.BookShopManager.BookShopManager.dto.UserDto;
import com.BookShopManager.BookShopManager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    void saveUser(UserDto userDto);
}
