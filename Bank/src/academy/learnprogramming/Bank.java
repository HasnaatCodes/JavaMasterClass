package academy.learnprogramming;

public class Bank {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;

    }

    public void setBalance(int balance){
        this.balance = balance;

    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;

    }

    public void setEmail(String email){
        this.email = email;

    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;

    }

    public int getAccountNumber(){

        return accountNumber;

    }

    public int getBalance(){

        return balance;

    }

    public String getCustomerName(){

        return customerName;

    }

    public String getEmail(){

        return email;

    }

    public String getPhoneNumber(){

        return phoneNumber;

    }

    public void depositFunds(int amount){

        int currentBalance = getBalance();
        int newBalance = currentBalance + amount;
        setBalance(newBalance);
        System.out.println("Amount deposited");

    }

    public void withdrawFunds(int amount){

        int currentBalance = getBalance();

        if ((currentBalance - amount) < 0){
            System.out.println("Insufficient Funds");
        }else{
            int newBalance = currentBalance - amount;
            setBalance(newBalance);
            System.out.println("Amount successfully added");
        }
    }

}
