package com.luxury.virtualwaiter_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tagId;

    private String tagName;

    @ManyToOne
    @JoinColumn(name="menu_item_id", nullable=false)
    private MenuItem menuItem;
}
