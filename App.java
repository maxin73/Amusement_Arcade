import java.util.Scanner;

public class App {
    public static int wallet = 10;

    public static void main(String[] args) throws InterruptedException {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("\n*** Welcome to CICCC Amusement Arcade! ***");
        System.out.println("\n");

        do {
            Thread.sleep(1000);
            System.out.println("   Main Menu");
            Thread.sleep(1000);
            System.out.println("---------------");
            System.out.println("1. Check Balance");
            System.out.println("2. Online Shop");
            System.out.println("3. Making Money -Rock Paper Scissors-");
            System.out.println("4. Making Money -High & Low-");
            System.out.println("5. Exit");
            System.out.println("---------------");
    
            Thread.sleep(1500);
            System.out.println("Enter a value");
            option = scanner.next().charAt(0);
            System.out.println("\n");
    
    
            switch (option) {
            case '1':
                Thread.sleep(1000);
                System.out.println("💵 Your balance is: $" + wallet + " 💵\n");
                break;
    
            case '2': 
                OnlineShop os = new OnlineShop();
                os.shopMenu();
                break;
    
            case '3':
                RockPaperScissors rps = new RockPaperScissors();
                rps.rps();
                break;

            case '4':
                HighAndLow hal = new HighAndLow();
                hal.hl();      
                break;
            
            case '5':
                Thread.sleep(1000);
                System.out.println("Goodbye!\n");               
                break;
            
            default:
                Thread.sleep(1000);
                System.out.println("Please try again");
                break;
            }
        }while(option != '5');
    
        }

    }
