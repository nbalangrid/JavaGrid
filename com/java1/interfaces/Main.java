package com.java1.interfaces;

public class Main {

    public static void main(String[] args) {

        User[] users= new User[5];

        users[0]= new User(1L,"Ion","Popescu");
        users[1]= new User(100L,"Mircea","Lazarescu");
        users[2]= new User(12L,"Adriana","Iliescu");
        users[3]= new User(14L,"Ioana","Avram");
        users[4]= new User(123L,"Gigel","Surdu");

        Account[] accounts = new Account[5];

        accounts[0]= new Account(2L,1235L,users[3]);
        accounts[1]= new Account(23L,1785L,users[4]);
        accounts[2]= new Account(42L,8767L,users[1]);
        accounts[3]= new Account(55L,2343L,users[2]);
        accounts[4]= new Account(19L,6385L,users[0]);

        AccountService service = new AccountServiceImpl(accounts);
        Account searchedAccount=service.findAccountByOwnerId(14L);

        System.out.println();
        if(searchedAccount != null) {
            System.out.println("Account Id: " + searchedAccount.getId() + " Balance: " + searchedAccount.getBalance());
        }
        long balanceGreaterThen=2000L;
        System.out.print("Number of accounts with balance greather than "+balanceGreaterThen+" : ");
        System.out.println(service.countAccountsWithBalanceGreaterThan(balanceGreaterThen));
    }

}
