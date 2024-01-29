package org.example.model.enitiy;

import org.example.emums.Status;
import org.example.model.entity.Employee;
import org.example.model.entity.Task;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class TaskTest {

    @Test
    public void testTask(){
        Employee employee = new Employee(1L, "jon@mail.com", "John", "Doe", "Designer");
        Task task = new Task(employee,  1L, "Blah blah" , Status.NEW);

        assertEquals(1L, task.getId());
        assertEquals("Blah blah", task.getDescription());
        assertEquals(employee, task.getEmployee());
        assertEquals("NEW", task.getStatus().getLabel().toUpperCase());
    }
}
