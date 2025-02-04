class Conditionalsystem {
    int userguess;
    int randomnum;
    boolean correctguess;
    Conditionalsystem(int userguess, int randomnum,boolean correctguess){
        this.userguess=userguess;
        this.randomnum=randomnum;
        this.correctguess=correctguess;
    }
    void setUserguessperformance(){
        if(userguess<randomnum){
            System.out.println("Too Low ! Try again.");
        }else if(userguess>randomnum){
            System.out.println("Too high! Try again.");
        }else{
            System.out.println("Congratutions! You guessed the number.");
            correctguess=false;
        }
    }
}
