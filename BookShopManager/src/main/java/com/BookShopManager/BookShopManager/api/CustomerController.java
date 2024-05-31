package com.BookShopManager.BookShopManager.api;

import com.BookShopManager.BookShopManager.dto.CustomerDto;
import com.BookShopManager.BookShopManager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @PostMapping
    public void saveCustomer(@RequestBody CustomerDto customerDto){
        customerService.saveCustomer(customerDto);
    }
    @PutMapping
    public void updateCustomer(@RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerDto);
    }
    @DeleteMapping
    public void deleteCustomer(@RequestParam String customerId){
        customerService.deleteCustomer(customerId);
    }
    @GetMapping("/{customerId}")
    public CustomerDto getCustomer(@PathVariable String customerId){
        return customerService.getCustomer(customerId);
    }
    @GetMapping("/customerList")
    public ArrayList<CustomerDto> getCustomerList(@RequestParam int size,
                                                  @RequestParam int page,
                                                  @RequestParam String searchText){
        return customerService.getAllCustomers(size,page,searchText);
    }
}
