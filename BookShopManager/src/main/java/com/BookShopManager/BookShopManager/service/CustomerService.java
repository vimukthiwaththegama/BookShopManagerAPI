package com.BookShopManager.BookShopManager.service;

import com.BookShopManager.BookShopManager.dto.CustomerDto;

import java.util.ArrayList;

public interface CustomerService {
    void saveCustomer(CustomerDto customerDto);
    void updateCustomer(CustomerDto customerDto);
    void deleteCustomer(String customerId);
    CustomerDto getCustomer(String customerId);
    ArrayList<CustomerDto> getAllCustomers(int size,int page,String searchText);
}
