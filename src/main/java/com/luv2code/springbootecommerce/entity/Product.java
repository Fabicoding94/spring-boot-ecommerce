package com.luv2code.springbootecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory category;
    @Column(name = "sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "unitPrice")
    private BigDecimal unitPrice;
    @Column(name = "imageUrl")
    private String imageUrl;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "unitsInStock")
    private int unitsInStock;
    @Column(name = "dateCreated")
    @CreationTimestamp
    private Date dateCreated;
    @Column(name = "lastUpdated")
    private Date lastUpdated;


}
