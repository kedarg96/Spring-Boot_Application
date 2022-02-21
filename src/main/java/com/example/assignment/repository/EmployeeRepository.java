package com.example.assignment.repository;

import com.example.assignment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(value = "Select salary from Employee where emp_id=?1")
    List<Long> findSlaryById(long emp_id);

    @Query(value = "from Employee where dept=?1 order by emp_id")
    List<Employee> findBYDept(String dept);
}
