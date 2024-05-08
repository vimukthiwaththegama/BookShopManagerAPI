package com.BookShopManager.BookShopManager.api;

import com.BookShopManager.BookShopManager.dto.BookOrderDto;
import com.BookShopManager.BookShopManager.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/bookOrder")
public class BookOrderController {
    @Autowired
    private BookOrderService bookOrderService;
    @PostMapping
    public void saveBookOrder(@RequestBody BookOrderDto bookOrderDto){
        bookOrderService.saveBookOrder(bookOrderDto);
    }
    @PutMapping
    public void updateBookOrder(@RequestBody BookOrderDto bookOrderDto){
        bookOrderService.updateBookOrder(bookOrderDto);
    }
    @DeleteMapping
    public void deleteOrder(@RequestParam String orderId){
        bookOrderService.deleteBookOrder(orderId);
    }
    @GetMapping("/{orderId}")
    public BookOrderDto getBookOrder(@PathVariable String orderId){
        return bookOrderService.getBookOrder(orderId);
    }
    @GetMapping("bookOrderList")
    public ArrayList<BookOrderDto> getAllBookksOrder(int size,int page,String orderId){
        return bookOrderService.getAllBookOrders(size, page, orderId);
    }
}
