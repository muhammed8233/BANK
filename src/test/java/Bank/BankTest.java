package Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank();

    @Test
    void CheckIfCreateAccountHasDetail() {
        bank.setCreateAccount("muhammed suleiman",
                "25353534",TYPE.SAVINGS, 0.0);
        System.out.print(bank.getCreateAccount());
    }

    @Test
    void testToConfirmIfBalanceDecreasesAfterDebitIsMade() {
        assertEquals(0.0, bank.account.getBalance());
        bank.account.deposit(1000.0);
        assertEquals(1000.0,bank.account.getBalance());
        bank.debit(100.0);
        assertEquals(900,bank.getBalance());
    }
    @Test
    void testToConfirmIfBalanceIncreasesAfterCreditIsMade() {
        assertEquals(0.0, bank.account.getBalance());
        bank.account.deposit(1000.0);
        assertEquals(1000.0,bank.account.getBalance());
        bank.debit(100.0);
        assertEquals(900,bank.getBalance());
        bank.credit(2000.0);
        assertEquals(2900.0, bank.getBalance());
    }
}