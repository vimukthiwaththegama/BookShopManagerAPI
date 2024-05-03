package com.BookShopManager.BookShopManager.dto;

import com.BookShopManager.BookShopManager.entity.Book;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDto {
    private String custId;
    private String custName;
    private String custEmail;
    @ManyToMany(mappedBy = "   customers")
    private List<Book> books;

    @Override
    public String toString(){
        return "CustomerDto{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", custEmail='" + custEmail + '\'' +
                ", book='" + books +
                '}';
    }
}
