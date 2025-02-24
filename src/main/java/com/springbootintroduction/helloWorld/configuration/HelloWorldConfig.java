package com.springbootintroduction.helloWorld.configuration;

import com.springbootintroduction.helloWorld.Entity.Department;
import com.springbootintroduction.helloWorld.Entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    @Bean
    public Employee employeeService(){
        return new Employee();
    }

    @Bean
    public Department departmentService(){
        return new Department();
    }
}
