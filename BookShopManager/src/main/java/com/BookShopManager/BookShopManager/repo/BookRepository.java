package com.BookShopManager.BookShopManager.repo;

import com.BookShopManager.BookShopManager.entity.BookOrder;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookOrder,String> {

}
