package org.example.service;

import org.example.model.dto.EmployeeDto;
import org.example.model.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee addEmployee(Employee employee);

    Employee addEmployee(EmployeeDto employeeDto);

    Employee findById(Long id);

    void deleteById(Long id);

    Employee save(EmployeeDto employee, Long id);
}
