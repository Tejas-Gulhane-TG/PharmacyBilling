package com.example.Pharmacy_Billing_Web_Api.Repository;

import com.example.Pharmacy_Billing_Web_Api.Model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

    List<Bill> findByMobileNo(long MobileNo);
}