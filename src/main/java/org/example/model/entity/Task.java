package org.example.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.emums.Status;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Task {
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column
    @Id
    private long id;

    @Column
    private String description;

    @Column
    private Status status;

}
