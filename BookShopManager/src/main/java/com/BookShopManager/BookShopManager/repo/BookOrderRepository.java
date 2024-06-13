package com.BookShopManager.BookShopManager.repo;

import com.BookShopManager.BookShopManager.dto.BookOrderDto;
import com.BookShopManager.BookShopManager.entity.Book;
import com.BookShopManager.BookShopManager.entity.BookOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookOrderRepository extends JpaRepository<BookOrder,Integer>{
}
