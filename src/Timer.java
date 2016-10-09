/*
 * Timer class
 *
 * This is the Timer singleton class to to be used for
 * the Exploration programs. This will initiate the
 * timer and stop the timer when being called. This will
 * return the time passed in nanoseconds.
 */

public class Timer {

    private static Timer instance = null;
    private static long lngStartIt;
    private static long lngStopIt;

    // constructor
    protected Timer(){

    }

    // singleton constructor
    public static Timer getInstance(){
        if(instance == null)
            instance = new Timer();

        return instance;
    }

    // This will create the timer at the beginning of the program
    public static void startTimer(){
        lngStartIt = System.nanoTime();
        System.out.println("Timer started at " + lngStartIt);
    }

    // Call this method whenever the program is done and it will
    // return the time passed in nanoseconds.
    public static void stopTimer(){
        lngStopIt = System.nanoTime();
        System.out.println("Timer stopped at " + lngStopIt);
        System.out.println("Total time: " + (lngStopIt - lngStartIt) + " nanoseconds");
    }
}
