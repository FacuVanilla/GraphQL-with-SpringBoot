package com.oluwaseun.graphql.model;


public class Employee {

    private String empId;
    private String empName;
    private String empEmail;
    private String empNationality;

    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpEmail() {
        return empEmail;
    }
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    public String getEmpNationality() {
        return empNationality;
    }
    public void setEmpNationality(String empNationality) {
        this.empNationality = empNationality;
    }
}