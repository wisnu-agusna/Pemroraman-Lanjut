package Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        String rev = "";
        for (char i : arr)
            rev = i + rev;
        System.out.println(rev);
    }
}