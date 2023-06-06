package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.oliveiratec.Account;

public class AccountTests {
    @Test
    public void depositShouldIncreaseBalaceWhenPositiveAmount(){
        double amount = 200.0;
        double expectedValue = 196.0;
        Account acc = new Account(1L, 0.0);
        acc.deposit(amount);
        Assertions.assertEquals(expectedValue , acc.getBalance());
    }
    @Test
    public void depositShouldDoNothingWhenNegativeAmount(){

        double expectedValue = 100.00;
        Account acc = new Account(1L, 100.0);
        double amount = -200.0;

        acc.deposit(amount);
        Assertions.assertEquals(expectedValue, acc.getBalance());

    }



}
