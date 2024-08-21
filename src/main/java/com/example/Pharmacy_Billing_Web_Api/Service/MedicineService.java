package com.example.Pharmacy_Billing_Web_Api.Service;

import com.example.Pharmacy_Billing_Web_Api.DTO.Request.MedicineRequestDto;

public interface MedicineService {

    Object AddMedicine(MedicineRequestDto medicineRequestDto);
}
