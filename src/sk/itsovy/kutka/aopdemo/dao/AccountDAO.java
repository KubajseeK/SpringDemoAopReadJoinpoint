package sk.itsovy.kutka.aopdemo.dao;

import org.springframework.stereotype.Component;

import sk.itsovy.kutka.aopdemo.Account;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public void addAccount(Account account, boolean vipFlag) {

        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");

    }

    public boolean doWork() {
        System.out.println(getClass() + ": Do Something");
        return false;
    }

    public String getName() {
        System.out.println("getName" + getClass());
        return name;
    }

    public void setName(String name) {
        System.out.println("setName" + getClass());
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println("getServiceCode" + getClass());
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println("setService" + getClass());
        this.serviceCode = serviceCode;
    }
}

