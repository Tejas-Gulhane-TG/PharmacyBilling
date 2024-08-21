package com.example.Pharmacy_Billing_Web_Api.Transformer;

import com.example.Pharmacy_Billing_Web_Api.DTO.Request.MedicineRequestDto;
import com.example.Pharmacy_Billing_Web_Api.Model.Medicine;

public class MedicineTransformer {

    public static Medicine RequestDtoToMedicine(MedicineRequestDto medicineRequestDto){
        return Medicine.builder()
                .name(medicineRequestDto.getName())
                .price(medicineRequestDto.getPrice())
                .quantity(medicineRequestDto.getQuantity())
                .build();
    }
}
