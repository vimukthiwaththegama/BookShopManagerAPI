package com.BookShopManager.BookShopManager.service.implementation;

import com.BookShopManager.BookShopManager.dto.CustomerDto;
import com.BookShopManager.BookShopManager.repo.CustomerRepository;
import com.BookShopManager.BookShopManager.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void saveCustomer(CustomerDto customerDto) {
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(String customerId) {

    }

    @Override
    public CustomerDto getCustomer(String customerId) {
        return null;
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers(int size, int page, String searchText) {
        return null;
    }
}
