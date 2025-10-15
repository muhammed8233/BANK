package Bank;

public class Account {
    private String name;
    private double balance;
    private String number;
    private String update;
    private TYPE type;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0) {
            balance = balance + depositAmount;
            System.out.println(depositAmount +
                    " have been deposited into your account new balance is: $"
                    + getBalance());
        }else if(depositAmount < 0.0 || depositAmount < balance){
            System.out.println("invalid amount please try again");
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0.0) {
            balance = balance - withdrawAmount;
            System.out.println(withdrawAmount + " have been withdrawn successfully new balance is: $"
                    + getBalance());
        }
    }
    public void transfer(double transferAmount){
        if (transferAmount > 0.0) {
            balance = balance - transferAmount;
        }
    }

    public void setType(TYPE type){
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getUpdate() {
        return update;
    }



    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\n' +
                ", number='" + number + '\n' +
                ", type=" + type +
                '}';
    }
}
