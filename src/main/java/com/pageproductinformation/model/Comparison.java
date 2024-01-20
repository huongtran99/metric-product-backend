package com.pageproductinformation.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "comparisons")
public class Comparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "price_comparison")
    private String priceComparison;

}
