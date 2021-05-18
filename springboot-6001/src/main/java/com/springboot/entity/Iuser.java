package com.springboot.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * IUSER
 */
@Data
public class Iuser implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private static final long serialVersionUID = 1L;
}