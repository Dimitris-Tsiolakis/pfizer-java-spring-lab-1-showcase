package com.acme.eshop.domain;

import com.acme.eshop.domain.enumeration.CustomerCategory;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseModel {
    private String email;
    private String firstname;
    private String lastname;
    private Integer age;
    private String address;
    private CustomerCategory customerCategory;
}
