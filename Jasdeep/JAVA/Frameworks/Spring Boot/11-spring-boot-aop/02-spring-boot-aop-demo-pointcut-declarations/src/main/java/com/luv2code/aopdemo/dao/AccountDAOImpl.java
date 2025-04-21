package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String name;

    private String ServiceName;

    @Override
    public void addAccount(Account theAccount, boolean vipFlag) {
        System.out.println(getClass()+": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean doWork() {

        System.out.println(getClass()+": doWork()");

        return false;
    }

    public String getName() {
        System.out.println(getClass()+": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass()+": in setName()");
        this.name = name;
    }

    public String getServiceName() {
        System.out.println(getClass()+": in getServiceName()");
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        System.out.println(getClass()+": in setServiceName()");
        ServiceName = serviceName;
    }
}
