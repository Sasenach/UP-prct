package com.example.nikogdanesvyajusvoujiznsvebom.Repository;

import com.example.nikogdanesvyajusvoujiznsvebom.Model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    public List<Employee> findByNameContaining(String name);
}
