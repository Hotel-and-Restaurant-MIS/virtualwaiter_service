package com.luxury.virtualwaiter_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SelectedAddOn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long selectedAddOnId;

    @OneToOne
    @JoinColumn(name = "add_on_id", nullable=false)
    private AddOn addOn;

    @OneToOne
    @JoinColumn(name = "order_item_id",nullable = false)
    private OrderItem orderItem;
}
