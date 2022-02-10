package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @Column(name = "customer_name")
    private String customerName;
    private String email;

    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
    }
}
