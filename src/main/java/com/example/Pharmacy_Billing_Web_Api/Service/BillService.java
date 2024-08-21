package com.example.Pharmacy_Billing_Web_Api.Service;

import com.example.Pharmacy_Billing_Web_Api.DTO.Request.BillRequestDto;
import com.example.Pharmacy_Billing_Web_Api.Model.Bill;

import java.util.List;

public interface BillService {
    Object NewBill(BillRequestDto billRequestDto);

    List<Bill> GetBill(long mobileNo);
}
