package com.springbootintroduction.helloWorld;

import com.springbootintroduction.helloWorld.Entity.Department;
import com.springbootintroduction.helloWorld.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication  implements CommandLineRunner{
	@Autowired
	private Employee employee;

	@Autowired
	private Department department;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		employee.setId(1111);
		employee.setName("Prince Raj");

		department.setName("Software Developer");
		employee.setDepartment(department);

		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getDepartment().getName());
	}


}
