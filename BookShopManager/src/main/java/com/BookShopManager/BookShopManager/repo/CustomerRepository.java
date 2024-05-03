package com.BookShopManager.BookShopManager.repo;

import com.BookShopManager.BookShopManager.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String > {

}
