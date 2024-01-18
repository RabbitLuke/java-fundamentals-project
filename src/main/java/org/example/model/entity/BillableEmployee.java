package org.example.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.persister.collection.mutation.UpdateRowsCoordinatorNoOp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BillableEmployee extends Employee {

    @Column
    int level;


    public String getPosition(){
        return super.getPosition() + " level" + level;
    }
}
