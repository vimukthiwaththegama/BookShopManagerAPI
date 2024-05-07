package com.BookShopManager.BookShopManager.service.implementation;

import com.BookShopManager.BookShopManager.dto.BookDto;
import com.BookShopManager.BookShopManager.entity.Book;
import com.BookShopManager.BookShopManager.repo.BookRepository;
import com.BookShopManager.BookShopManager.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void saveBook(BookDto bookDto) {
        bookRepository.save(new Book(bookDto.getBookId(),bookDto.getAuthor(),bookDto.getName(),bookDto.getPrice(),bookDto.getCustomers()));
    }

    @Override
    public void updateBook(BookDto bookDto) {
        Optional<Book> tempBook=bookRepository.findById(bookDto.getBookId());
        if(tempBook.isPresent()){
            tempBook.get().setAuthor(bookDto.getAuthor());
            tempBook.get().setName(bookDto.getName());
            tempBook.get().setPrice(bookDto.getPrice());
            tempBook.get().setCustomers(bookDto.getCustomers());
        }
    }

    @Override
    public void deletebook(String bookId) {
        Optional<Book> tempBook=bookRepository.findById(bookId);
        if(tempBook.isPresent()){
            bookRepository.delete(tempBook.get());
        }
    }

    @Override
    public BookDto getBook(String bookId) {
        Optional<Book> tempBook=bookRepository.findById(bookId);
        if(tempBook.isPresent()){
            return new BookDto(
                    tempBook.get().getBookId(),
                    tempBook.get().getAuthor(),
                    tempBook.get().getName(),
                    tempBook.get().getPrice(),
                    tempBook.get().getCustomers()
            );
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<BookDto> getAllBooks(int size, int page, String searchText) {
        List<Book> all = bookRepository.findAll();
        ArrayList<BookDto> bookDtos = new ArrayList<>();
        for(Book book:all){
            bookDtos.add(new BookDto(book.getBookId(),book.getAuthor(),book.getName(),book.getPrice(),book.getCustomers()));
        }
        return bookDtos;
    }
}
