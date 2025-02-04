import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int userguess=0;
        Randomnum randnum1 = new Randomnum();
        int randnum=randnum1.getRandnum();
        while(userguess!=randnum){
            System.out.print("Guess the Number : ");
            userguess=in.nextInt();
            Conditionalsystem conditionalsystem = new Conditionalsystem(userguess,randnum);
        }
    }
}
