import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int userguess=0;
        int numberofattempts=0;
        Randomnum randnum1 = new Randomnum();
        int randnum=randnum1.getRandnum();
        boolean correctGuess=true;
        try{
            while(correctGuess){
                System.out.print("Guess the Number : ");
                userguess=in.nextInt();
                Conditionalsystem conditionalsystem = new Conditionalsystem(userguess,randnum,correctGuess);
                conditionalsystem.setUserguessperformance();
                numberofattempts+=1;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }

        System.out.println("Number of attempts : "+numberofattempts);
    }
}
