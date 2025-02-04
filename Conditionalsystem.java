class Conditionalsystem {
    int userguess;
    int randomnum;
    Conditionalsystem(int userguess, int randomnum){
        this.userguess=userguess;
        this.randomnum=randomnum;
        if(userguess<randomnum){
            System.out.println("Too Low ! Try again.");
        }else if(userguess>randomnum){
            System.out.println("Too high! Try again.");
        }else{
            System.out.println("Congratutions! You guessed the number.");
        }
    }
}
