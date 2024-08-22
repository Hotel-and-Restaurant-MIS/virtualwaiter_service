package com.luxury.virtualwaiter_service.model;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SingleTableOrder {
    @Id
    private String orderid;
    @Id

}
