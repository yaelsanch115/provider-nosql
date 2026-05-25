package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "product")
public class Product {
    @Id
    private String id;
    private String name;
    private Double price;
    private String provider = "Proveedor NoSQL (MongoDB)";
}
