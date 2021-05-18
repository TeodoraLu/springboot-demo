package com.springboot.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * IUSER
 */
@Data//为类提供读写属性（提供get/set方法）
public class Iuser implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private static final long serialVersionUID = 1L;
}