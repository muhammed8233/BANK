package Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account = new Account();

    @Test
    void testToConfirmNameIsSet() {
        account.setName("muhammed");
        assertNotNull("muhammed",account.getName());
    }

    @Test
    void testingToCheckSetBalance() {
        account.setBalance(0.0);
        assertEquals(0.0, account.getBalance());
    }

    @Test
    void testToConfirmAccountNumberIsSet() {
        account.setNumber("234525426");
        System.out.println((account.getNumber()));
    }

    @Test
    void testToCheckAccountBalanceIncreaseWhenDepositIsMade() {
        account.deposit(1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testToCheckAccountBalanceDecreaseWhenWithdrawalIsMade() {
        account.deposit(1000.0);
        account.withdraw(500.0);
        assertEquals(500.0, account.getBalance());
    }

    @Test
    void testToConfirmTransferMethod() {
        account.deposit(500.0);
        account.transfer(200.0);
        assertEquals(300.0, account.getBalance());
    }
}