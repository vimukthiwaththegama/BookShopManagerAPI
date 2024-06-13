package com.BookShopManager.BookShopManager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookOrder {
    @Id
    private Integer orderId;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Customer customer;

}
