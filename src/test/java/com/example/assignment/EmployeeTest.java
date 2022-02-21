package com.example.assignment;

import com.example.assignment.model.Employee;
import com.example.assignment.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
class EmployeeTest {

    @Autowired
    EmployeeRepository erepo;
    @Test
    public void testcreate()
    {
        Employee e=new Employee();
        e.setEmp_id(10L);
        e.setName("John");
        e.setDept("HR");
        e.setSalary(10000);
        erepo.save(e);

    }

    @Test
    public void readall()
    {
        List list = erepo.findAll();
    }

    @Test
    public void readsingle()
    {
        Employee e = erepo.findBYDept("HR").get(1);
    }

    @Test
    public void testupdatesalary()
    {
        Employee e = erepo.findById(10L).get();
        e.setSalary(25000);
        erepo.save(e);
    }

    @Test
    public void testdelete()
    {
        erepo.deleteById(10L);
    }

}
