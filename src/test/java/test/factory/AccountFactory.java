package test.factory;

import org.oliveiratec.Account;

public class AccountFactory {

    public static Account createEmptyAccount(){
        return new Account(1L, 0.0);
    }

    public static Account createAccount(double initialBalance){
        return new Account(1L, initialBalance);
    }
}
