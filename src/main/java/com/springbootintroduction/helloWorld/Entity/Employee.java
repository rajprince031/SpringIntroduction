package com.springbootintroduction.helloWorld.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String name;
    private int id;
    private Department department;
}
