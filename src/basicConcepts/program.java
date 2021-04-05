package basicConcepts;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hari : ");
        int days = scanner.nextInt();

        int hours = days * 24;

        int minutes = hours * 60;

        int seconds = minutes * 60;

        System.out.println(days + " Hari = " + seconds + " detik");
    }
}