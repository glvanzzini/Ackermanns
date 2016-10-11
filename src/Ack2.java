/**
 * Created by Giampiero on 10/2/2016.
 * Professor: Dr. Becnel
 * Class: CSC 342
 * Date Due: 10/11/16
 * Program: Ackermann function(two parameter version)
 * Purpose: To take in 2 command line integer inputs and return the value computed by the Ackermann function.
 */
public class Ack2 {
    private static Timer timer = Timer.getInstance(); //initializes timer
    public static void main(String[] args){
        timer.startTimer(); //starts nanosecond timer
        int m = 0; //input variables
        int n = 0;

        if(args.length >= 2){ //if command line arguments are passed in use them
            m = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);
        }else { //if not just use 3 and 2
            m = 3;
            n = 2;
        }

        System.out.println("Value computed: " + Ack(m, n)); //prints ackermann value


        timer.stopTimer(); //stops and prints timer
    }


    private static int Ack(int m, int n){ //this is the implementation of the ackermanns function
        if(m == 0){
            return n + 1;
        }
        if(m > 0 && n == 0){
            return Ack(m-1, 1);
        }
        if(m > 0 && n > 0){
            return Ack(m -1, Ack(m, n - 1));
        }

        return -1;
    }
}