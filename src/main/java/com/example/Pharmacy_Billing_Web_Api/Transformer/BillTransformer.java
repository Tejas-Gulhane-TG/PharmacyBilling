package com.example.Pharmacy_Billing_Web_Api.Transformer;

import com.example.Pharmacy_Billing_Web_Api.DTO.Request.BillRequestDto;
import com.example.Pharmacy_Billing_Web_Api.Model.Bill;

public class BillTransformer {

    public static Bill RequestToBill(BillRequestDto billRequestDto){
        return Bill.builder()
                .mobileNo(billRequestDto.getMobileNo())
                .patientName(billRequestDto.getPatientName())
                .totalPrice(billRequestDto.getTotalPrice())
                .medicineList(billRequestDto.getMedicineList())
                .build();
    }
}
