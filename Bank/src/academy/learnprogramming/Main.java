package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        VipCustomer cust = new VipCustomer();
//        VipCustomer cust = new VipCustomer("John", 500, "na@na.com");

        System.out.println(cust.getName());
        System.out.println(cust.getCreditLimit());
        System.out.println(cust.getEmail());

/*
        Bank bank = new Bank();

        bank.setBalance(500);
        bank.setAccountNumber(5468);
        bank.setCustomerName("John");
        bank.setEmail("na@na.com");
        bank.setPhoneNumber("678");

        System.out.println("Customer Name: " + bank.getCustomerName());
        System.out.println("Account Number: " + bank.getAccountNumber());
        System.out.println("Balance : " + bank.getBalance());
        System.out.println("Phone Number: " + bank.getPhoneNumber());

        System.out.println(" ");
        System.out.println(" ");

        bank.depositFunds(300);
        bank.withdrawFunds(600);
        System.out.println("New Balce: " + bank.getBalance());
*/
    }
}
