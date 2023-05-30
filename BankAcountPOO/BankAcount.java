public class BankAcount {
  private static int number;
  private double balance;
  private BankAcount count;
  private static int option;
    
  public BankAcount(int number){
    BankAcount.number = number;
    balance = 0.0;
  }

  /**
   * @return a instance of the object BankAcount
   */
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

/**
 * @param number
 * @return the veryfying digit of the count
 */
public static int verifyingDigit(int number){
  String inverse="", mult="", sumString="";
  int code=0, numInt, invInt;
  Integer sumInt=0;

  String numberString = String.valueOf(number);
  if(numberString.length() == 3){
    for(int i = numberString.length()-1; i>=0; i--){
      inverse = inverse.concat(Character.toString(numberString.charAt(i)));
    }
    invInt = Integer.parseInt(inverse);
    numInt = Integer.parseInt(numberString);
    sumInt = (numInt + invInt);
    sumString = sumInt.toString();

    for(int i=1; i<=sumString.length()-1;i++){
      mult = Character.toString(sumString.charAt(i) * (i));
    }
    code = mult.charAt(1);
  }
  return code;
}

  /**
   * @param value
   */
  public void withdraw(double value){
    if(getBalance() >= value){
      setBalance(getBalance() - value);
    }
  }

  /**
   * @param value
   */
  public void deposit(double value){
    setBalance(getBalance() + value);
  }
 
}

