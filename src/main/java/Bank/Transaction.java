package Bank;

import java.time.LocalDateTime;

public class Transaction {
    private String debitAccount;
    private  String creditAccount;
    private double amount;
    private  TYPE type;
    private LocalDateTime transactionTime;

    Account account =new Account();


    public void setDebitAccount(String name, String number, double withdrawAmount,TYPE type) {
        account.setName(name);
        account.setNumber(number);
        account.withdraw(withdrawAmount);
        account.setType(type);
        debitAccount = name + number + withdrawAmount + type;
    }
    public String getDebitAccount() {
        return debitAccount;
    }

    public void setCreditAccount(String creditAccount) {
        this.creditAccount = creditAccount;
    }

    public String getCreditAccount() {
        return creditAccount;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }



    public void setAmount(double balance) {
        account.setBalance(balance);
        amount = balance;
    }
    public double getAmount() {
        return amount;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }



    public void setType(TYPE type){
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }



}
