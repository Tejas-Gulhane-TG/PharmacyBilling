package com.example.Pharmacy_Billing_Web_Api.Controller;

import com.example.Pharmacy_Billing_Web_Api.DTO.Request.BillRequestDto;
import com.example.Pharmacy_Billing_Web_Api.Model.Bill;
import com.example.Pharmacy_Billing_Web_Api.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    BillService billService;

    @PostMapping("/new")
    public ResponseEntity NewBill(@RequestBody BillRequestDto billRequestDto){
        return new ResponseEntity<>(billService.NewBill(billRequestDto), HttpStatus.CREATED);
    }

    @GetMapping("/get/by-mobileNo/{MobileNo}")
    public List GetBill(@PathVariable long MobileNo){
        List<Bill> bills = new ArrayList<>();
        bills = billService.GetBill(MobileNo);
        return bills;
    }
}
