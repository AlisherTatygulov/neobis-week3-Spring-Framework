package com.neobis.springbootdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "book_id")
    private int bookId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

}