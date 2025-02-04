import java.util.Random;
class Randomnum {
    int randnum;
    Randomnum(){
        Random ran = new Random();
        randnum=ran.nextInt(100)+1;
    }
    int getRandnum(){
        return randnum;
    }
}
