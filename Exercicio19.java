import java.util.Scanner;

public class Exercicio19 {
  /**
   * 19. Faça um programa que simule uma conta bancária. A conta inicia com o saldo zerado. 
   * Inicialmente, o programa mostra ao usuário o seguinte menu de opções:
   * 1 - Ver saldo Atual
   * 2 - Depositar
   * 3 - Sacar.
   * O programa deve pedir ao usuário a opção a ser executada e realizá-la, exibindo o saldo atual 
   * na tela. Tanto a operação de depósito quanto a de saque devem solicitar ao usuário o valor que 
   * o usuário deseja depositar/sacar. As operações correspondentes a essas duas operações 
   * (depositar e sacar) devem ser feitas por métodos (uma para cada operações). Use switch quando 
   * possível.
   */

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int option;
    double currenBalance=0.0, amountDeposited=0.0, withdraw = 0.0;

    do{
    menu();
    switch(option = in.nextInt()){
      case 1: System.out.printf("\nValor de Saldo Atual: %.2f\n", currenBalance);
      break;
      case 2: System.out.println("Qual o valor a ser depositado? ");
      amountDeposited = in.nextDouble();
      currenBalance = deposit(currenBalance, amountDeposited);
      System.out.println("Valor depositado na conta.");
      break;
      case 3: System.out.println("Qual o valor a ser sacado? ");
      withdraw = in.nextDouble();
      currenBalance = withdrawValue(currenBalance, withdraw);
      System.out.println("Valor sacado da conta.");
      break;
      case 4: System.out.println("Encerrando programa.");
      break;
      default: System.out.println("Opção inválida.");
    } 
    }while(option != 4);
    System.out.println(".::Sistema encerrado::.");
    in.close();
  }
  public static void menu(){
    System.out.println("---------------MENU---------------");
    System.out.println("Escolha uma das opções abaixo:");
    System.out.println();
    System.out.println("1 - Ver saldo atual");
    System.out.println("2 - Depositar");
    System.out.println("3 - Sacar");
    System.out.println("4 - Sair");
    System.out.println("----------------------------------");
  }
  public static double deposit(double currenBalance, double amountDeposited){
    return currenBalance + amountDeposited;
  }
  public static double withdrawValue(double currenBalance, double withdraw){
    return currenBalance - withdraw;
  }
}