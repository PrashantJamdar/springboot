package com.micro.limitsservice;

import java.util.Date;

public final class Customer{

    private final int custId;
    private final Date dob;

    public Customer(int custId,Date dob){
        this.custId=custId;
        this.dob=dob;
    }

    public int getCustId(){
        return custId;
    }

    public Date getDob(){
        return new Date(this.dob.getTime());
    }
}
