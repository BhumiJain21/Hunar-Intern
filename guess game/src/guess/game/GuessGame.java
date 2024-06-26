package guess.game;
import java.util.Random;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        int playernumber;
        Random rand=new Random();
        int guess=rand.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int trycount=0;
        while(true){
             System.out.println("heyyy! enter number between 1 to 100:");
             playernumber=sc.nextInt();
            trycount++;
            if(guess==playernumber){
                System.out.println("Congratulations! you win the game");
                System.out.println("you take " + trycount + " tries "+ " to win the game");
                break;
            }
            else if(playernumber>guess){
                System.out.println("Nope!!your guess is too high.Try again");
               
            }
            else{
                System.out.println("Nope!!your guess is too low.Try again");
                
            }
        }
    }    
}
