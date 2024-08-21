package com.example.Pharmacy_Billing_Web_Api.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    String patientName;

    @Column(nullable = false)
    long mobileNo;

    @Column(nullable = false)
    double totalPrice;

    List<Medicine> medicineList = new ArrayList<>();
}
