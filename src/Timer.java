/*
 *  Timer class to keep track time conveniently.
 *  Feel free to modify. This is based from the
 *  "MyTimerTest" class, except this was created
 *  to easily be able to be adaptable to the
 *  Exploration Project.
 *  
 */


import java.util.Date;

public class Timer {

    private static Timer instance = null;
    private static long lngStartIt;
    private static long lngStopIt;
    private static int i, j = 100;

    protected Timer(){

    }

    public static Timer getInstance(){
        if(instance == null){
            instance = new Timer();
        }
        return instance;
    }


    public static void startTimer(){
        Date dteTms = new Date();
        lngStartIt = dteTms.getTime();

        System.out.println("Timer started at " + lngStartIt);

//        for(i = 0; i < 1000; i++) {
//            if (i % 2 == 0) {
//                //System.out.println("Even");
//                j = j + 1;
//            } else {
//                //System.out.println("Odd");
//                j = j - 1;
//            }
//        }
    }

    public static void stopTimer(){
        Date dteRms = new Date();
        lngStopIt = dteRms.getTime();

        System.out.println("Timer stopped at " + lngStopIt);
        System.out.println("Total time: " + (lngStopIt - lngStartIt) + " milliseconds");
    }

//    public static void printTimer(){
//        Date dteCurrent = new Date();
//        long lngCurrent = dteCurrent.getTime();
//
//        System.out.println("Current time is at " + lngCurrent);
//        System.out.println("Current time in ms is in " + (lngCurrent - lngStartIt));
//    }

}
