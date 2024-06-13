package com.BookShopManager.BookShopManager.service;

import com.BookShopManager.BookShopManager.dto.AuthorDto;

import java.util.ArrayList;

public interface AuthorService {
    void saveAuthor(AuthorDto authorDto);
    void updateAuthor(AuthorDto authorDto);
    void deleteAuthor(Integer authorId);
    AuthorDto getAuthor(Integer authorId);
    ArrayList<AuthorDto> getAllAuthors(int size,int page,String searchText);
}
