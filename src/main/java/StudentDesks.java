import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classSize1 = scanner.nextInt();
        int classSize2 = scanner.nextInt();
        int classSize3 = scanner.nextInt();


        //Calculates how many desks each class needs
        int desks1 = (classSize1 / 2) + (classSize1%2);
        int desks2 = (classSize2 / 2) + (classSize2%2);
        int desks3 = (classSize3 / 2) + (classSize3%2);
        
        //Adds up the total number of desks and prints them to the screen
        int totalDesks = desks1 + desks2 + desks3;
        System.out.println(totalDesks);

        //Closing the scanner object
        scanner.close();
    }
}