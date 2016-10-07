/**
 * Created by jacobmurillo on 10/7/16.
 */
public class Ack3 {

    public static void main(String args[]){

        int arr[];

        if(false){

        }
        else{
            arr = new int[2];
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 3;

        }

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
