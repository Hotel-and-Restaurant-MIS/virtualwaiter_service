package com.luxury.virtualwaiter_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.awt.*;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    private String specialNote;
    private Integer quantity;
    private Date dateTime;
    private Double totalPrice;

    @ManyToOne
    @JoinColumn(name = "menu_item_id", nullable = false)
    private MenuItem menuItem;

    @OneToOne
    @JoinColumn(name = "table_id", nullable = false)
    private SingleTableOrder singleTableOrder;

    @OneToOne
    @JoinColumn(name = "order_id", nullable = false)
    private SingleTableOrder singleTableOrder2;
}