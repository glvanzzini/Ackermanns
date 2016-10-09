/**
 * Created by jacobmurillo on 10/7/16.
 */
public class Ack3 {
    private static Timer timer = Timer.getInstance();
    public static void main(String args[]){
        timer.startTimer();
        int arr[];

        if(args.length >= 2 && args.length <= 3) {
            arr = new int[args.length];
            System.out.print("The arguments: ");
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
                System.out.print(arr[i] + " ");
            }
        }
        else{
            arr = new int[3];
            arr[0] = 3;
            arr[1] = 2;
            arr[2] = 3;
        }

        System.out.println("\nThe value: " + Ack(arr[0], arr[1], arr[2]));
        timer.stopTimer();
    }

    private static int Ack(int m, int n, int p){

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
        else{
            return Ack(m, Ack(m, n-1, p), p-1);
        }
    }

}
