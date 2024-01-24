package com.micro.limitsservice;

public class Employee {
    private int employeeId;
    private String empName;
    private String empDepart;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDepart() {
        return empDepart;
    }

    public void setEmpDepart(String empDepart) {
        this.empDepart = empDepart;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int employeeId, String empName, String empDepart, double salary) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.empDepart = empDepart;
        this.salary = salary;
    }
}
