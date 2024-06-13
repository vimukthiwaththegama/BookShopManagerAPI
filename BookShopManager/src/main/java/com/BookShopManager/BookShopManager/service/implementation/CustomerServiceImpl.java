package com.BookShopManager.BookShopManager.service.implementation;

import com.BookShopManager.BookShopManager.dto.BookDto;
import com.BookShopManager.BookShopManager.dto.CustomerDto;
import com.BookShopManager.BookShopManager.entity.Book;
import com.BookShopManager.BookShopManager.entity.Customer;
import com.BookShopManager.BookShopManager.repo.CustomerRepository;
import com.BookShopManager.BookShopManager.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void saveCustomer(CustomerDto customerDto){
        customerRepository.save(new Customer(customerDto.getCustId(),customerDto.getCustName(),customerDto.getCustEmail(),customerDto.getBooks()));
    }

    @Override
    public void updateCustomer(CustomerDto customerDto){
        Optional<Customer> tempCustomer = customerRepository.findById(customerDto.getCustId());
        if(tempCustomer.isPresent()){
            tempCustomer.get().setCustName(customerDto.getCustName());
            tempCustomer.get().setCustEmail(customerDto.getCustEmail());
            tempCustomer.get().setBooks(customerDto.getBooks());
        }
    }

    @Override
    public void deleteCustomer(Integer customerId){
        Optional<Customer> checkCustomer = customerRepository.findById(customerId);
        if(checkCustomer.isPresent()){
            customerRepository.delete(checkCustomer.get());
        }
    }

    @Override
    public CustomerDto getCustomer(Integer customerId){
        Optional<Customer> custData = customerRepository.findById(customerId);
        if(custData.isPresent()){
            return new CustomerDto(
                    custData.get().getCustId(),
                    custData.get().getCustName(),
                    custData.get().getCustEmail(),
                    custData.get().getBooks()
            );
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers(int size, int page, String searchText){
        List<Customer> allCustomers = customerRepository.findAll();
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        for(Customer customer :allCustomers){
            customerDtos.add(new CustomerDto(customer.getCustId(),customer.getCustName(),customer.getCustEmail(),customer.getBooks()));
        }
        return customerDtos;
    }
}
