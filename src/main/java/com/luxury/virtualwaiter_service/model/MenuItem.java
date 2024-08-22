package com.luxury.virtualwaiter_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuItemId;

    private String menuItemName;
    private String description;
    private String imageUrl;
    private Double menuItemPrice;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;
}
