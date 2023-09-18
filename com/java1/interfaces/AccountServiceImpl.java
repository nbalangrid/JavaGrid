package com.java1.interfaces;

 class AccountServiceImpl implements AccountService {

     Account[] accounts;

     public AccountServiceImpl(Account[] accounts){
         this.accounts=accounts;
     }

     @Override
     public Account findAccountByOwnerId(long id) {


         for(Account acc : accounts){
             if (acc.getOwner().getId()==id){
                 return acc;
             }
         }

         return null;
     }

     @Override
     public long countAccountsWithBalanceGreaterThan(long value) {

         int sum=0;

         for(Account acc: accounts){
             if(acc.getBalance()>value){
                 sum=sum+1;
             }

         }

         return sum;
     }
 }
