package com.inheritance;

import com.sun.org.glassfish.gmbal.IncludeSubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="P_employee")
@PrimaryKeyJoinColumn(name = "sid")

public class P_Employee extends Employee{
    @Column(name="salary")
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
