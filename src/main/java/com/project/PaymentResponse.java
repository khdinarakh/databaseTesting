package com.project;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentResponse {
    private final Long orderId;
    private final String creditCardNumber;
}
