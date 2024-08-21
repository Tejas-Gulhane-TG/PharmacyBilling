package com.example.Pharmacy_Billing_Web_Api.DTO.Request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MedicineRequestDto {

    String name;

    int quantity;

    double price;
}
