import java.util.Scanner;

public class Ui {
  private static int option;
  //private int number;

  public static int getOption() {
    return option;
  }

  public static void setOption(int option) {
    Ui.option = option;
  }

  
  /**
   * @param option
   * @param count
   */
  public static void menu(int option, BankAcount count){
    optionMenu(option, count);
    Scanner in = new Scanner(System.in);
    
    System.out.println();
    System.out.println(">> Sua nova conta tem o número: " + count.getNumber());
    do{
      System.out.println("-------------------MENU-------------------");
      System.out.println("Escolha uma das opções de operação abaixo:");
      System.out.println("1 - Obter Código de Verificação");
      System.out.println("2 - Sacar");
      System.out.println("3 - Depositar");
      System.out.println("4 - Ver Saldo");
      System.out.println("5 - Criar uma nova conta ");
      System.out.println("0 - Sair");
      System.out.println();
      System.out.print("Opção Escolhida: ");
      System.out.println();
      option = in.nextInt();
      optionMenu(option,count);
      System.out.println();
    }while(option != 0);
    in.close();
    }
  
    /**
     * @param option
     * @param count
     */
    public static void optionMenu(int option, BankAcount count){
      double value;
      Scanner in = new Scanner(System.in);
      switch(option){
        case 1: System.out.printf("\nCódigo de Verificação da conta: %d",count.getNumber());
          System.out.println();
          System.out.printf("\nO código de verificação da conta %d é: %d", count.getNumber(), BankAcount.verifyingDigit(count.getNumber()));
          break;
        case 2: System.out.printf("\nInforme o valor a ser sacado da conta %d: ", count.getNumber());
          value = in.nextDouble();
          count.withdraw(value);
          break;
        case 3: System.out.printf("\nInforme o valor a ser depositado na conta %d: ", count.getNumber());
          value = in.nextDouble();
          count.deposit(value);
          break;
        case 4: System.out.printf("\nO saldo atual da conta %d é de: %.2f", count.getNumber(), count.getBalance());
          break;
        case 5: System.out.printf("\nCriando uma nova conta: ", BankAcount.newAcount());
          break;
        case 0: System.out.println("..::Encerrando Programa::..");
          break;
        default:
          System.out.println("Opção Inválida.");
          break;
      }
    }
  }
