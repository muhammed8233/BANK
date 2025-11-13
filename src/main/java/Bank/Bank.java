package Bank;

public class Bank {
    private String createAccount;
    private double balance;
    private double transfer;

    Account account = new Account();


    public void setCreateAccount(String name, String accountNumber,
                                 TYPE type, double balance) {
        account.setName(name);
        account.setNumber(accountNumber);
        account.setType(type);
        account.setBalance(balance);
        createAccount = name  + " " + accountNumber + " " + type + " "+ balance;
    }

    public String getCreateAccount() {
        return createAccount;
    }
    public void debit(double debitAmount){
        if(debitAmount < account.getBalance() || debitAmount == account.getBalance()){
            balance = account.getBalance() - debitAmount;
            System.out.println("$"+ debitAmount +" have been debited from your account new balance is: $"
                    + balance );
        }

    }
    public void credit(double creditAmount){
        if (creditAmount > 0.0 || creditAmount == account.getBalance()){
            balance = balance + creditAmount;
            System.out.println("your account have been credited with $" + creditAmount +
                    " new balance is: $" + balance);
        }
    }

    public void transfer(double transferAmount){
        if (transferAmount > 0.0) {
            balance = balance - transferAmount;
            System.out.println(transferAmount + " have been transfer successfully to " + getCreateAccount());
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

}
