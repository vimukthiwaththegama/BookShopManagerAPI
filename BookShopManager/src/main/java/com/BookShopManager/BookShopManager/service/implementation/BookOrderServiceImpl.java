package com.BookShopManager.BookShopManager.service.implementation;

import com.BookShopManager.BookShopManager.dto.BookOrderDto;
;
import com.BookShopManager.BookShopManager.entity.BookOrder;
import com.BookShopManager.BookShopManager.repo.BookOrderRepository;
import com.BookShopManager.BookShopManager.service.BookOrderService;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookOrderServiceImpl implements BookOrderService {
    private final BookOrderRepository bookOrderRepository;;

    public BookOrderServiceImpl(BookOrderRepository bookOrderRepository) {
        this.bookOrderRepository = bookOrderRepository;
    }

    @Override
    public void saveBookOrder(BookOrderDto bookOrderDto) {
        bookOrderRepository.save(new BookOrder(bookOrderDto.getOrderId(),bookOrderDto.getBook(),bookOrderDto.getCustomer()));
    }

    @Override
    public void updateBookOrder(BookOrderDto bookOrderDto) {
        Optional<BookOrder> tempBookOrderDto=bookOrderRepository.findById(bookOrderDto.getOrderId());
        if(tempBookOrderDto.isPresent()){
            tempBookOrderDto.get().setBook(bookOrderDto.getBook());
            tempBookOrderDto.get().setCustomer(bookOrderDto.getCustomer());
        }
    }

    @Override
    public void deleteBookOrder(Integer bookOrderId) {
        Optional<BookOrder> checkBookOrderDto = bookOrderRepository.findById(bookOrderId);
        if(checkBookOrderDto.isPresent()){
            bookOrderRepository.delete(checkBookOrderDto.get());
        }
    }

    @Override
    public BookOrderDto getBookOrder(Integer bookOrderId) {
        Optional<BookOrder> bookOrderdata = bookOrderRepository.findById(bookOrderId);
        if(bookOrderdata.isPresent()){
            return new BookOrderDto(
                    bookOrderdata.get().getOrderId(),
                    bookOrderdata.get().getBook(),
                    bookOrderdata.get().getCustomer());
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<BookOrderDto> getAllBookOrders(int size, int page, String searchText) {
        List<BookOrder> allBookOrders = bookOrderRepository.findAll();
        ArrayList<BookOrderDto> bookOrdersDtos = new ArrayList<>();
        for(BookOrder bookOrder: allBookOrders){
            bookOrdersDtos.add(new BookOrderDto(bookOrder.getOrderId(),bookOrder.getBook(),bookOrder.getCustomer()));
        }
            return bookOrdersDtos;
    }
}

