package com.example.employee.entity;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VO  implements Serializable {
    private employee employee;
    private  department department;
}
