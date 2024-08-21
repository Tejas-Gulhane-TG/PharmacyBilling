package com.example.Pharmacy_Billing_Web_Api.DTO.Request;

import com.example.Pharmacy_Billing_Web_Api.Model.Medicine;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BillRequestDto {

    String patientName;

    long mobileNo;

    double totalPrice;

    List<Medicine> medicineList = new ArrayList<>();
}
