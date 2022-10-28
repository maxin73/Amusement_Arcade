import java.util.HashMap;
import java.util.Scanner;

public class OnlineShop {  
    static int wallet;
    
    public OnlineShop(int wallet) {
      this.wallet = wallet;
    }

    public OnlineShop() {
    }

    //Payent method
    public static void payment(int cash){
      if(cash > App.wallet){
        System.out.println("You cannot afford to buy this...");
      }else{
        App.wallet -= cash;
      }
    }

    public static void shopMenu() throws InterruptedException {
      char option = '\0';
      Scanner scanner = new Scanner(System.in);
      
      do {
        Thread.sleep(1000);
        System.out.println("--*--*--*--*--*--*--");
        System.out.println("  Online Shop CICCC" );
        System.out.println("--*--*--*--*--*--*-- \n");

        Thread.sleep(1500);
        System.out.println("===============");
        System.out.println("1. Broken Desk           $1");
        System.out.println("2. Blue Chair            $20");
        System.out.println("3. iPhone 14             $50");
        System.out.println("4. MacBookPro            $100");
        System.out.println("5. Kubilay's Sunglasses  $200");
        System.out.println("6. Back to Main Menu");
        System.out.println("===============");

        Thread.sleep(1000);
        System.out.println("Which item do you wanna buy?");
        option = scanner.next().charAt(0);
        System.out.println("\n");

        HashMap<String, Integer> list = new HashMap<>();
          list.put("Broken Desk", 1);
          list.put("Blue Chair", 20);
          list.put("iPhone 14", 50);
          list.put("MacBookPro", 100);
          list.put("Kubilay's Sunglasses", 200);


        switch (option) {
        case '1':
          Thread.sleep(1000);
          System.out.println("You chose 'Broken Desk'.");
          Thread.sleep(1000);
          payment(list.get("Broken Desk"));

          Thread.sleep(1500);
          System.out.println("\n💰Your balance is $" + App.wallet +".\n\n");
            break;

        case '2': 
          Thread.sleep(1000);
          System.out.println("You chose 'Blue Chair'.");
          Thread.sleep(1000);
          payment(list.get("Blue Chair"));

          Thread.sleep(1500);
          System.out.println("\n💰Your balance is $" + App.wallet +".\n");              
            break;

        case '3':
          Thread.sleep(1000);
          System.out.println("You chose 'iPhone 14'.");
          Thread.sleep(1000);
          payment(list.get("iPhone 14"));

          Thread.sleep(1500);
          System.out.println("\n💰Your balance is $" + App.wallet +".\n");            
            break;

        case '4':
          Thread.sleep(1000);
          System.out.println("You chose 'MacBookPro'.");
          Thread.sleep(1000);
          payment(list.get("MacBookPro"));

          Thread.sleep(1500);
          System.out.println("\n💰Your balance is $" + App.wallet +".\n");    
            break;
        
        case '5':
        Thread.sleep(1000);
          System.out.println("You chose 'Kubilay's Sunglasses'.");
          Thread.sleep(1000);
          payment(list.get("Kubilay's Sunglasses"));

          Thread.sleep(1500);
          System.out.println("\n💰Your balance is $" + App.wallet +".\n");              
            break;
        
        case '6':
          Thread.sleep(1000);
          System.out.println("Thank you for your purchase. \n");
            break;

        default:
            Thread.sleep(1000);
            System.out.println("Please try again");
            break;
        }
    }while (option != '6'); 
  }
}
