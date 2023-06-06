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
        acc.daposit(amount);
        Assertions.assertEquals(expectedValue , acc.getBalance());
    }




}
