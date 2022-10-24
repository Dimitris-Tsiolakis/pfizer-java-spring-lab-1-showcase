package com.acme.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Setter
@Getter
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseModel {
    private String serial;
    private String name;
    private BigDecimal price;
    //private Category category;
}
