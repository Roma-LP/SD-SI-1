package com.example.demo.model;

import lombok.Data;

@Data
public abstract class Base {
    private Long objectId;
    private Long objectTypeId;
    private Long parentId;
    private String name;
}
