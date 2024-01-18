package org.example.model.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto {

    public TaskDto(){

    }

    private long employeeId;

    private String description;

    private String status;
}
