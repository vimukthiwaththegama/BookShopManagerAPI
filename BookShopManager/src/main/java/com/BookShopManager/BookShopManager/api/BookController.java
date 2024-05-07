package com.BookShopManager.BookShopManager.api;

import com.BookShopManager.BookShopManager.dto.BookDto;
import com.BookShopManager.BookShopManager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/Book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public void saveBook(@RequestBody BookDto bookDto){
        bookService.saveBook(bookDto);
    }
    @PutMapping
    public void updateBook(@RequestBody BookDto bookDto){
        bookService.updateBook(bookDto);
    }
    @DeleteMapping
    public void deleteBook(@RequestParam String bookId){
        bookService.deletebook(bookId);
    }
    @GetMapping("/{id}")
    public BookDto getBook(@PathVariable String bookId){
        return bookService.getBook(bookId);
    }
    @GetMapping("/bookList")
    public ArrayList<BookDto> getAllBooks(int size,int page,String searchText){
        return bookService.getAllBooks(size,page,searchText);

    }

}
