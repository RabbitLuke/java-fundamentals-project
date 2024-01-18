package org.example.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {

    public EmployeeDto() {
    }

    private String email;

    private String firstName;

    private String lastName;

    private String position;
}
