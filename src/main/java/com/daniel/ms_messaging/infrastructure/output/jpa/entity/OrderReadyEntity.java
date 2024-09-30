package com.daniel.ms_messaging.infrastructure.output.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class OrderReadyEntity {
    @Id
    private long orderId;
    private String validationCode;

}
