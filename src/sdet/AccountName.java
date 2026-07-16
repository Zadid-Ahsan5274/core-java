package sdet;

public class AccountName {
    static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(101);
        System.out.println("Account Number: "+account.getAccount_number());
        account.setName("John Doe");
        System.out.println("Account Holder Name: "+account.getName());
        account.setAmount(1001);
        System.out.println("Account Balance: "+account.getAmount());
    }
}
