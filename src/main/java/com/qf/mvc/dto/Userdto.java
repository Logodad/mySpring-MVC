package com.qf.mvc.dto;

import lombok.Data;

import java.util.List;

@Data
public class Userdto {
    private int id;
    private String username;
    private Address address;
    private List<String> list;
}
