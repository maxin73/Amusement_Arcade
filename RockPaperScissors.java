import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public void rps() throws InterruptedException{
        int win = 0;
        int earnedMoney = 0;

        System.out.println("");
        for (int i = 1; i < 4; i++){
        Thread.sleep(1000);
        System.out.println("* ROUND " + i + " *");
        int user = getUser();
        int pc = getPc();
        String result = judge(user, pc);

        showResult(user, pc, result);
        if (result == "WIN"){
            win++;}
        }
        
        if(win == 1){
            System.out.println("*** You won 1 time! ***");
        }else if(win >= 2){
            System.out.println("*** You won " + win + " times! ***");
        }else{
            System.out.println("*** You coudn't win at all. That's unlucky... ***");
        }

        if(win > 0){
            earnedMoney += (10*win);
            App.wallet += earnedMoney;
        }
        Thread.sleep(1500);
        System.out.println("\n💰You have earned $" + earnedMoney + ".\n");
    
}

public static int getUser() throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
    
    while(true) {
        Thread.sleep(1000);
        System.out.println("=====================");
        System.out.println("'Rock, Paper, Scissors...'");
        Thread.sleep(1000);
        System.out.println("choose your hand!");
        Thread.sleep(1000);
        System.out.println("Rock: 0    Paper: 1    Scissors: 2");
        System.out.println("=====================");

        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if(number <= -1 || number >= 3) {
                Thread.sleep(1000);
                System.out.println("【Error】You can choose 0, 1 or 2 \n ");
            }else{
                return number;
            }
        }else{
            Thread.sleep(1000);
            System.out.println("【Error】Please enter an integer. \n ");
            scanner.next();
        }
    } }


public static int getPc(){
    Random random = new Random();
    return random.nextInt(3);
}

public static String judge(int user, int pc){
    String[][] rps =  {
        {"DRAW","LOSE","WIN"},
        {"WIN","DRAW","LOSE"},
        {"LOSE","WIN","DRAW"}           
    };
    return rps[user][pc];
}

public static void showResult(int user, int pc, String result) throws InterruptedException {
String[] rps = {"Rock", "Paper", "Scissors"};
Thread.sleep(1000);
System.out.println("\nYou: " + rps[user] + "   PC: " + rps[pc]);
Thread.sleep(1500);
System.out.println("Result: " + result + "\n\n");
}
}

