package com.BookShopManager.BookShopManager.repo;

import com.BookShopManager.BookShopManager.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,String> {
}
