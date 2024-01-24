package com.micro.limitsservice;

public class DepartmentDetails {

    Integer departId;
    String departDesc;
    public DepartmentDetails(Integer departId, String departDesc) {
        super();
        this.departId = departId;
        this.departDesc = departDesc;
    }
    public Integer getDepartId() {
        return departId;
    }
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }
    public String getDepartDesc() {
        return departDesc;
    }
    public void setDepartDesc(String departDesc) {
        this.departDesc = departDesc;
    }
    @Override
    public String toString() {
        return "DepartmentDetails [departId=" + departId + ", departDesc=" + departDesc + "]";
    }
}
