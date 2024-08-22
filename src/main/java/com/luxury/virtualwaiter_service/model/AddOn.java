package com.luxury.virtualwaiter_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddOn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addOnId;

    private String addOnName;
    private Double addOnPrice;

    @ManyToMany
    @JoinColumn(name = "menu_item_id", nullable = false)
    private List<MenuItem> menuItem;

}
