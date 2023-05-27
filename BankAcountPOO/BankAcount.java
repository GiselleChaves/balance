public class BankAcount {
  private static int number;
  private double balance;
  private BankAcount count;
  private static int option;
    
  public BankAcount(int number){
    BankAcount.number = number;
    balance = 0.0;
  }

  public static BankAcount newAcount(){
    number += 1;
    BankAcount count = new BankAcount(number);
    Ui.menu(option,count);
    return count;
  }

  public String toString(){
    return "Nome da Conta: " + getCount() + ", Número da Conta: " + getNumber();
  }
  
  public void setBalance(double balance){
    this.balance = balance;
  }

  public int getNumber(){
    return number;
  }

  public double getBalance(){
    return balance;
  }

  public BankAcount getCount(){
    return count;
  }

public int verifyingDigit(String number){
  //String inverse="", mult="", sumString="";
  //int code=0, num, inv;
  Integer sumInt=0;

  if(number.length() == 3){
    for(int i = number.length()-1; i>=0; i--){
      inverse = inverse.concat(Character.toString(number.charAt(i)));
    }
    inv = Integer.parseInt(inverse);
    num = Integer.parseInt(number);
    sumInt = (num + inv);
    sumString = sumInt.toString();

    for(int i=1; i<=sumString.length()-1;i++){
      mult = Character.toString(sumString.charAt(i) * (i));
    }
    code = mult.charAt(1);
  }
  return code;
}

  public void withdraw(double value){
    if(getBalance() >= value){
      setBalance(getBalance() - value);
    }
  }

  public void deposit(double value){
    setBalance(getBalance() + value);
  }
 
}

