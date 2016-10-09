/**
 * Created by Giampiero on 10/2/2016.
 */
public class Ack2 {
    private static Timer timer = Timer.getInstance();
    public static void main(String[] args){
        timer.startTimer();
        int[] arr;
       if(args.length >= 2 && args.length <= 3){
           arr = new int[args.length];
           System.out.print("The arguments: ");
           for(int i = 0; i < args.length; i++){
                arr[i] = Integer.parseInt(args[i]);
               System.out.print(arr[i] + " ");
           }
       }else {
           arr = new int[2];
           arr[0] = 3;
           arr[1] = 2;
       }

       System.out.println("\nThe value: " + Ack(arr[0], arr[1]));


        timer.stopTimer();
    }


    private static int Ack(int m, int n){
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
