import java.lang.reflect.Array;
import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Insert the length of the array");
        int lengthOfList = reading.nextInt();

        double sum = 0;

        for (int i = 1; i <= lengthOfList; i++) {

            System.out.println("Insert the student score");
            double nota = reading.nextDouble();
            sum += nota;
        }
        double mean = sum / lengthOfList;
        System.out.println(mean);
    }
}
