package com.example.Pharmacy_Billing_Web_Api.Controller;

import com.example.Pharmacy_Billing_Web_Api.DTO.Request.MedicineRequestDto;
import com.example.Pharmacy_Billing_Web_Api.Service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

    @Autowired
    MedicineService medicineService;

    @PostMapping("/add")
    public ResponseEntity AddMedicine(@RequestBody MedicineRequestDto medicineRequestDto){
        return new ResponseEntity<>(medicineService.AddMedicine(medicineRequestDto), HttpStatus.CREATED);
    }
}
