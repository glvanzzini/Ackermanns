/**
 * Created by Giampiero on 10/2/2016.
 */
public class Ack2 {

    public static void main(String[] args){
        int[] arr;
       if(args.length >= 2 && args.length <= 3){
           arr = new int[args.length];
           for(int i = 0; i < args.length; i++){
                arr[i] = Integer.parseInt(args[i]);
               System.out.print(arr[i] + " ");
           }
       }else {
           arr = new int[2];
           arr[0] = 3;
           arr[1] = 2;
       }

       System.out.println(Ack(arr[0], arr[1]));



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
