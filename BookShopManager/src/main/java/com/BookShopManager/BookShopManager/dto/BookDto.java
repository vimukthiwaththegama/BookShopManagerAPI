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
    private Integer bookId;
    private Author author;
    private String name;
    private double price;


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
