package com.example.assignment;

import com.example.assignment.model.Employee;
import com.example.assignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAssignmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAssignmentApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();

		employee.setEmp_id(10);
		employee.setName("John");
		employee.setDept("HR");
		employee.setSalary(30000);
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setEmp_id(11);
		employee1.setName("Aryan");
		employee1.setDept("IT");
		employee1.setSalary(35000);
		employeeRepository.save(employee1);

	}
}
