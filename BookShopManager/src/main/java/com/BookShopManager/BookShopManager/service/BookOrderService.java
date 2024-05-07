package com.BookShopManager.BookShopManager.service;

import com.BookShopManager.BookShopManager.dto.BookDto;
import com.BookShopManager.BookShopManager.dto.BookOrderDto;
import com.BookShopManager.BookShopManager.entity.Book;

import java.util.ArrayList;

public interface BookOrderService {
    void saveBookOrder(BookOrderDto bookOrderDto);
    void updateBookOrder(BookOrderDto bookOrderDto);
    void deleteBookOrder(String bookOrderId);
    BookOrderDto getBookOrder(String bookOrderId);
    ArrayList<BookOrderDto> getAllBookOrders(int size,int page,String searchText);
}
