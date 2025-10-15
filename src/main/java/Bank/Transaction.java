package Bank;

import java.time.LocalDateTime;

public class Transaction {
    private Account debitAccount;
    private  Account creditAccount;
    private  TYPE type;
    private LocalDateTime transactionTime;

    Bank bank = new Bank();
    Account account =new Account();


    public Account getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(Account debitAccount) {
        this.debitAccount = debitAccount;
    }

    public Account getCreditAccount() {
        return creditAccount;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    public void setCreditAccount(Account creditAccount) {
        this.creditAccount = creditAccount;
    }

    public void setType(TYPE type){
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }



}
