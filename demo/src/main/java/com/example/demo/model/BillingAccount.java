package com.example.demo.model;

import com.example.demo.annotations.Attribute;
import com.example.demo.annotations.ObjectType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@ObjectType(objectTypeId = "3")
public class BillingAccount extends Base {
    private Customer customer;
    @Attribute(attrId = "8")
    private BigDecimal balance;
    @Attribute(attrId = "6")
    private Status status;
}
