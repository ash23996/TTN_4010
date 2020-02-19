package ashita.java2;
import java.io.*;

class q7 {
    // function convert second into day
    // hours, minutes and seconds
    static void ConvertSectoDay(int sec) {
        int day = sec / (24 * 3600);

        sec = sec % (24 * 3600);
        int hour = sec / 3600;

        sec %= 3600;
        int minutes = sec / 60 ;

        sec %= 60;
        int seconds = sec;

        System.out.println( day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }

    // Driver code
    public static void main (String[] args) {
        // Given n is in seconds
        int sec = 129680;
        ConvertSectoDay(sec);

    }
}
