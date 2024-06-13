package com.BookShopManager.BookShopManager.dto;

import com.BookShopManager.BookShopManager.entity.Book;
import jakarta.persistence.OneToMany;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AuthorDto {
    private Integer authorId;
    private String authorName;
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    @Override
    public String toString(){
        return "AuthorDto{" +
                "authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", books='" + books +
                '}';
    }
}