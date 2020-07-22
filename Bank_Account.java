/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author 325235711
 */
public class Bank_Account {

    private boolean expired;
    private String name;
    private char gender;
    private String bank_number;
    private int security_code;
    private double account_amount;

    public Bank_Account(boolean expired, String name,char gender ,String bank_number, int security_code, double account_amount) {
        this.expired = expired;
        this.name = name;
        this.gender = gender;
        this.bank_number = bank_number;
        this.security_code = security_code;
        this.account_amount = account_amount;

    }
    public Bank_Account(String name,char gender ,String bank_number, int security_code, double account_amount){
        this(false,name,gender,bank_number,security_code,account_amount);
    }
    public Bank_Account(String name, char gender, String bank_number, int security_code){
        this(false,name,gender,bank_number,security_code,0.0);
    }

}
