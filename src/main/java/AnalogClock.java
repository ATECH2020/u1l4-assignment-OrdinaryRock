import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourAngle = scanner.nextInt();

        final int circleAngle = 360;
        final int hoursOnClock = 12;
        final int minutesOnClock = 60;

        int currentMinutes = (hoursOnClock * minutesOnClock) * hourAngle / circleAngle;
        int leftoverMinutes = currentMinutes%60;
        int minuteAngle = circleAngle * leftoverMinutes / minutesOnClock;
        System.out.println(minuteAngle);

        // closing the scanner object
        scanner.close();
    }
}