package com.bsanju.employeemanagement.Service;

import com.bsanju.employeemanagement.Model.Employee;
import com.bsanju.employeemanagement.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // 🔹 Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // 🔹 Get Employee by ID
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    // 🔹 Add Employee
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // 🔹 Update Employee
    public Optional<Employee> updateEmployee(int id, Employee updatedEmployee) {
        return employeeRepository.findById(id).map(employee -> {
            employee.seteName(updatedEmployee.geteName());
            employee.seteDeptName(updatedEmployee.geteDeptName());
            employee.seteSalary(updatedEmployee.geteSalary());
            return employeeRepository.save(employee);
        });
    }

    // 🔹 Delete Employee
    public boolean deleteEmployee(int id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
