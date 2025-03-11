package com.bsanju.employeemanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int eId;
    private  String eName;
    private  String eDeptName;
    private double eSalary;


    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteDeptName() {
        return eDeptName;
    }

    public void seteDeptName(String eDeptName) {
        this.eDeptName = eDeptName;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }
}
