package com.BookShopManager.BookShopManager.service;

import com.BookShopManager.BookShopManager.dto.BookDto;

import java.util.ArrayList;

public interface BookService {
    void saveBook(BookDto bookDto);
    void updateBook(BookDto bookDto);
    void deletebook(Integer bookId);
    BookDto getBook(Integer bookId);
    ArrayList<BookDto> getAllBooks(int size, int page, String searchText);
}
