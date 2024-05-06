package com.BookShopManager.BookShopManager.dto;

import com.BookShopManager.BookShopManager.entity.Author;
import com.BookShopManager.BookShopManager.entity.Customer;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookDto {
    private String bookId;
    private Author author;
    private String name;
    private double price;
    @ManyToMany
    @JoinTable(
            name = "books_customers",
            joinColumns = {
                    @JoinColumn(name = "book_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "cust_id")
            }
    )
    private List<Customer> customers;

    @Override
     public String toString(){
        return "AuthorDto{" +
                "bookId='" + bookId + '\'' +
                ", author='" + author + '\'' +
                ", book='" + name + '\'' +
                ", price='" + price +
                '}';
    }
}
