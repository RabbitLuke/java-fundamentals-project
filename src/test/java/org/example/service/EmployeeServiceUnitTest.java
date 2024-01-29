package org.example.service;

import org.example.model.entity.Employee;
import org.example.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest

public class EmployeeServiceUnitTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Test
    public void getAllEmployeesTest(){
        List<Employee> expectedEmployees = Collections.singletonList(new Employee(0L, "guy@mail.com", "John", "Doe", "Designer"));

        when(employeeRepository.findAll()).thenReturn(expectedEmployees);

        List<Employee> resultEmployee = employeeService.getAllEmployees();
        Assertions.assertEquals(expectedEmployees, resultEmployee);
    }

    @Test
    public void deleteEmployeeTest(){
        List<Employee> expectedEmployees = Collections.singletonList(new Employee(0L, "guy@mail.com", "John", "Doe", "Designer"));

        employeeRepository.deleteById(expectedEmployees.get(0).getId());

        verify(employeeRepository).deleteById(expectedEmployees.get(0).getId());
    }

    @Test
    public void updateEmployeeTest(){
        List<Employee> expectedEmployees = Collections.singletonList(new Employee(0L, "guy@mail.com", "John", "Doe", "Designer"));


    }

    @Test
    public void addEmployeeTest(){
        Employee expectedEmployees = new Employee(0L, "guy@mail.com", "John", "Doe", "Designer");

        when(employeeRepository.save(expectedEmployees)).thenReturn(expectedEmployees);

        Employee savedEmployee = employeeService.addEmployee(expectedEmployees);
        Assertions.assertEquals(expectedEmployees, savedEmployee);


    }

    @Test
    public void findEmployeeByIdTest(){
        Employee expectedEmployees = new Employee(0L, "guy@mail.com", "John", "Doe", "Designer");
        when(employeeRepository.findById(expectedEmployees.getId())).thenReturn(Optional.of(expectedEmployees));

        Employee resultEmployee = employeeService.findById(expectedEmployees.getId());
        Assertions.assertEquals(expectedEmployees, resultEmployee);
    }
}
