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
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank_Account bob = new Bank_Account(false,"Bob",'m',"1234567890123456",145,2036.47);
        Bank_Account joe = new Bank_Account("Joe", 'm', "123456790123456", 456, 120.45);
        Bank_Account mary = new Bank_Account("Mary", 'f', "123456789024567", 657);
    }
    
}
