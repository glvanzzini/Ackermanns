/*
 * Created by Jacob on 10/5/16.
 *
 * Program: Ack3.java
 * This program is based on the Ackermann Problem that involves
 * three arguments.
 *
 */

public class Ack3 {

    private static Timer timer = Timer.getInstance();
    private static final int numArguments = 3; // number of arguments

    public static void main(String args[]){
        timer.startTimer();
        int arr[] = new int[numArguments];

        if(args.length == numArguments) {
            // set up the arguments in an array
            System.out.print("The arguments: ");
            for (int i = 0; i < numArguments; i++) {
                arr[i] = Integer.parseInt(args[i]);
                System.out.print(arr[i] + " ");
            }
        }
        else{
            // this will automatically assign values if no arguments are being used
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 1;
        }

        System.out.println("\nThe value: " + Ack(arr[0], arr[1], arr[2]));
        timer.stopTimer();
    }

    // Method: Ack - performs the Ackermann problem with 3 parameters
    // input: 3 integer arguments
    // output: the Ackermann solved number
    private static int Ack(int m, int n, int p){
        // the base cases
        if(p == 0){
            return m + n;
        }
        else if(n == 0 && p == 1){
            return 0;
        }
        else if(n == 0 && p ==2){
            return 1;
        }
        else if(n==0){
            return m;
        }
        // call to the recursive method
        else{
            return Ack(m, Ack(m, n-1, p), p-1);
        }
    }

}
