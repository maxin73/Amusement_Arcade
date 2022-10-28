import java.util.InputMismatchException;
import java.util.Scanner;

public class HighAndLow {

  public static void hl() throws InterruptedException{
    int win = 0;
    int earnedMoney = 0;

  Scanner scanner = new Scanner(System.in);

    int leftCard = (int) (Math.random()*9+1);
    int rightCard = (int) (Math.random()*9+1);

    System.out.println("=====================");
    System.out.println("'High & Low'");
    Thread.sleep(1000);
    System.out.println("The right card is...");
    Thread.sleep(1000);
    System.out.println("High: 1     Low: 0");
    Thread.sleep(1000);
    System.out.println("=====================");

      Thread.sleep(1000);
      System.out.println("*---------*       *---------*");
      System.out.println("|         |       |         |");
      System.out.println("|    " +leftCard+"    |       |         |");
      System.out.println("|         |       |         |");
      System.out.println("*---------*       *---------*");

      int select = 0;
      boolean loop = true;
      while(loop){
        try {
    //   if(scanner.hasNextInt()){
        select = scanner.nextInt();
        loop = false;
        }catch (InputMismatchException e){
          System.out.println("【Error】Please enter again.");
          scanner.next();
        }}


      Thread.sleep(1000);
      System.out.println("*---------*       *---------*");
      System.out.println("|         |       |         |");
      System.out.println("|    " +leftCard+"    |       |    "+rightCard+"    |");
      System.out.println("|         |       |         |");
      System.out.println("*---------*       *---------*");

      int result = 3;
      if(leftCard < rightCard){
        result = 1;
      }else if(leftCard > rightCard){
        result = 0;
      }else{
        result = 2;
      }

      
      if(select == result){
        Thread.sleep(1000);
        System.out.println("\n*** You Win! ***");
        win++;
      }else if(result == 2){
        Thread.sleep(1000);
        System.out.println("\n*** Draw, please try again! ***\n");
      }else{
        Thread.sleep(1000);
        System.out.println("\n*** You Lose... ***");
      }

      if(win > 0){
        earnedMoney += (10*win);
        App.wallet += earnedMoney;
      }
      Thread.sleep(1500);
      System.out.println("\n💰You have earned $" + earnedMoney + ".\n\n");
  }}

