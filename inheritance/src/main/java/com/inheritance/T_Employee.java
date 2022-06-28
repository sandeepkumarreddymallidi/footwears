package com.inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="T_employee")
@PrimaryKeyJoinColumn(name = "sid")


public class T_Employee extends Employee{
    @Column(name="hourlyRate")
    private double hourlyRate;
    @Column(name="duration")
    private double duration;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
