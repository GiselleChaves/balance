import java.util.Scanner;

public class App{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
   
    Bank bank = new Bank();
  
    bank.countList.add(BankAcount.newAcount());
    in.close();
  }
}