package org.example.service;

import org.example.exception.EmployeeNotFoundException;
import org.example.model.dto.EmployeeDto;
import org.example.model.entity.Employee;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee addEmployee(EmployeeDto employeeDto) {
        return employeeRepository.save(new Employee(employeeDto));
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found with " + id));
    }

    @Override
    public void deleteById(Long id) {
            if(employeeRepository.findById(id).isPresent()){
                employeeRepository.deleteById(id);
            }
            else{
                throw new EmployeeNotFoundException("This employee does not exist");
            };
    }

    @Override
    public Employee save(EmployeeDto employee, Long id) {
        Employee employee1 = employeeRepository.findById(id).get();

        if(employeeRepository.findById(id).isPresent()){
            employee1.setEmail(employee.getEmail());
            employee1.setFirstName(employee.getFirstName());
            employee1.setLastName(employee.getLastName());
            employee1.setPosition(employee.getPosition());
            employeeRepository.save(employee1);
        }
        else{
            throw new EmployeeNotFoundException("This employee does not exist");
        };

        return employee1;
    }


}
