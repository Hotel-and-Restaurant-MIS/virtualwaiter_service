package com.luxury.virtualwaiter_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SingleTableOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long singleTableOrderId;

    private Long orderId;
    private Integer tableId;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;
}
