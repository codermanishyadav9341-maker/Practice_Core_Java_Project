package Library.Encapusulations;

import Library.Encapusulations.BankAccount;

  class Main {

      public static void main(String[] args){
          BankAccount bb = new BankAccount();
          bb.setAccountNumber(566154);
          System.out.println("Account number:- " +bb.getAccountNumber());
      }
}
