package com.BookShopManager.BookShopManager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    @Id
    private String bookId;
    @ManyToOne
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

}
