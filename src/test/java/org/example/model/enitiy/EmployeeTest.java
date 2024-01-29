package org.example.model.enitiy;

import org.example.model.dto.EmployeeDto;
import org.example.model.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testEmployee() {
        Employee employee = new Employee(1L, "jon@mail.com", "John", "Doe", "Designer");

        Assertions.assertEquals(1L, employee.getId());
        Assertions.assertEquals("jon@mail.com", employee.getEmail());
        Assertions.assertEquals("John", employee.getFirstName());
        Assertions.assertEquals("Doe", employee.getLastName());
        Assertions.assertEquals("Designer", employee.getPosition());

    }

    @Test
    public void testEmployeeDtoConstructor(){
        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setFirstName("John");

        Employee employee = new Employee(employeeDto);
        Assertions.assertEquals(employeeDto.getFirstName(), employee.getFirstName());
    }

    @Test
    public void testEmployeeNoArgsConstructor(){
        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setFirstName("John");
//        employeeDto.setLastName("Doe");
//        employeeDto.setEmail("jon@mail.com");
//        employeeDto.setPosition("Designer");

        Employee employee = new Employee(employeeDto);
        Assertions.assertEquals("John", employee.getFirstName());
    }
}
