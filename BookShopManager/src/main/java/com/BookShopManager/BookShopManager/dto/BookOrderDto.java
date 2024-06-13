package com.BookShopManager.BookShopManager.dto;

import com.BookShopManager.BookShopManager.entity.Book;
import com.BookShopManager.BookShopManager.entity.Customer;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookOrderDto {
    private Integer orderId;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Customer customer;

    @Override
    public String toString(){
        return "bookOrderDto{" +
                "orderId='" + orderId + '\'' +
                ", book='" + book + '\'' +
                ", customer='" + customer +
                '}';
    }
}
