package org.springframework.samples.petclinic.product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotEmpty
    @Size(min = 3, max = 50)
    String name;

    @NotNull
    @PositiveOrZero
    double price;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    ProductType productType;
}
