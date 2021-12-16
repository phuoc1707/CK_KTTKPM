package com.example.employee.entity;

import lombok.*;

import java.io.Serializable;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class department implements Serializable {
    private  Long id;
    private String name_department;
}
