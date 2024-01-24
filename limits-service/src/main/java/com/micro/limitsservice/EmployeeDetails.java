package com.micro.limitsservice;

public class EmployeeDetails {

    Integer EmployeeId;
    Integer DepartId;
    String empName;
    public EmployeeDetails(Integer employeeId, Integer departId, String empName) {
        super();
        EmployeeId = employeeId;
        DepartId = departId;
        this.empName = empName;
    }
    public Integer getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }
    public Integer getDepartId() {
        return DepartId;
    }
    public void setDepartId(Integer departId) {
        DepartId = departId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    @Override
    public String toString() {
        return "EmployeeDetails [EmployeeId=" + EmployeeId + ", DepartId=" + DepartId + ", empName=" + empName + "]";
    }
}
