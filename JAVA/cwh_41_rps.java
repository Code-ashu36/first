package w3school;
import java.util.Random;
import java.util.Scanner;
public class cwh_41_rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO ROCK PAPER SCISSORS GAME");
        System.out.println("Enter--> 0 for rock ,1 for scissors, 2 for paper");
        Random random = new Random();
        int userscore = 0;
        int computerscore = 0;

        for (int i =0 ; i<3 ; i++){
            System.out.print("Enter your choice: ");
        int userinput = sc.nextInt();
        int computerinput = random.nextInt( 3);

        if (computerinput == userinput ){
            System.out.println("Round "+ (i+1) + " Its a draw");}
            else if(computerinput == 0 && userinput == 1 || computerinput == 2 && userinput == 0 || computerinput == 1 && userinput == 2 ){
            System.out.println("Round "+ (i+1) +" Computer wins you lose");
            computerscore++;
            }
        else if (userinput>2){
            System.out.println("Sorry give a valid input");
            break;
        }
        else {
            System.out.println("Round "+ (i+1) +" You win");
            userscore++;
        }
        // System.out.println("Computer choice was - ");
        if (computerinput==0){
            System.out.println("Computer choice was - Rock");}
            else if (computerinput == 1){
            System.out.println("Computer choice was - Scissors");
        }
        else if (computerinput==2){
            System.out.println("Computer choice was - paper");
        }
            System.out.println();
        }
            System.out.println("Sam boxer kole aage hai Final score :");
            System.out.println("you:"+ userscore);
            System.out.println("computer:"+ computerscore);
            if (userscore>computerscore){
                System.out.println("Sam Boxer jeet gya babyo");
            }
            else if (computerscore>userscore){
                System.out.println("Chale jao yha se");
            }else{
                System.out.println("Sam boxer kole hogya hai TIE");

}
        sc.close();
    }}

