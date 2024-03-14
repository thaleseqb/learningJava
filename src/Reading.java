import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Write your favorite movie");
        String movie = reading.nextLine();
        System.out.println(movie);
    }
}
