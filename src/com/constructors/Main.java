package com.constructors;

public class Main {
    public static void main(String[] args) {
        BankAccount michael = new BankAccount("512312311212312",170.0,"Michael Stevens","michael@home.co.uk","459123121");
        System.out.println(michael.getAccNumber());
        System.out.println(michael.getBalance());
        System.out.println(michael.getEmail());
        System.out.println(michael.getPhoneNr());
        System.out.println(michael.getCustomerName());
        michael.deposit(123.00);
        System.out.println(michael.getBalance());
        michael.withdraw(295.00);
        System.out.println(michael.getBalance());

        BankAccount timsAccount = new BankAccount("Tim","Tim@mail.com","1123123");
        System.out.println(timsAccount.getCustomerName() +" arve: " +timsAccount.getBalance() );

        VipCustomer vipMick = new VipCustomer();
        VipCustomer vipRick = new VipCustomer("Ricardo Diaz","dragon@arrow.ca");
        VipCustomer vipDick = new VipCustomer("Dick Tracy",1521.00,"privateI@investigation.com");
        System.out.println(vipMick.getName() + " " + vipMick.getCreditLimit());
        System.out.println(vipRick.getName() + " " + vipRick.getCreditLimit());
        System.out.println(vipDick.getName() + " " + vipDick.getCreditLimit());
    }
}
