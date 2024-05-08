package com.BookShopManager.BookShopManager.service;

import com.BookShopManager.BookShopManager.dto.BookDto;

import java.util.ArrayList;

public interface BookService {
    void saveBook(BookDto bookDto);
    void updateBook(BookDto bookDto);
    void deletebook(String bookId);
    BookDto getBook(String bookId);
    ArrayList<BookDto> getAllBooks(int size, int page, String searchText);
}
