package com.BookShopManager.BookShopManager.service;

import com.BookShopManager.BookShopManager.dto.CustomerDto;

import java.util.ArrayList;

public interface CustomerService {
    void saveCustomer(CustomerDto customerDto);
    void updateCustomer(CustomerDto customerDto);
    void deleteCustomer(Integer customerId);
    CustomerDto getCustomer(Integer customerId);
    ArrayList<CustomerDto> getAllCustomers(int size,int page,String searchText);
}
