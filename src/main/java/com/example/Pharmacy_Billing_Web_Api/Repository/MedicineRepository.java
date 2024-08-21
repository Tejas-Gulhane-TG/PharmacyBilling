package com.example.Pharmacy_Billing_Web_Api.Repository;

import com.example.Pharmacy_Billing_Web_Api.Model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    Medicine findByName(String name);
}
