package sdet;

public class Account {
    private int account_number;
    private String name;
    private double amount;

    void setAccountNumber(int accno) {
        account_number = accno;
    }

    int getAccount_number() {
        return account_number;
    }

    void setName(String n)
    {
        name = n;
    }

    String getName()
    {
        return name;
    }

    void setAmount(double amnt)
    {
        amount = amnt;
    }

    double getAmount()
    {
        return amount;
    }



}
