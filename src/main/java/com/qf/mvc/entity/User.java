package com.qf.mvc.entity;

import lombok.Data;

import java.io.Serializable;

@Data /*省略get set方法*/
public class User implements Serializable {
    private Integer uId=1;
    private String name="周润发";
}
