package com.bsanju.employeemanagement.Repository;

import com.bsanju.employeemanagement.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
