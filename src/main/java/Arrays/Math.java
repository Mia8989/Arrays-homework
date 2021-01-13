package Arrays;
import java.util.*;
import java.util.Scanner;



public class Math {
    public static void main(String[] args) {

        int i;
        int number = 0;
        int sum = 0;

        System.out.println("Please enter 5 numbers?");

        for (i = 0; i < 6; i++) {
            Scanner input = new Scanner(System.in);
            number = input.nextInt();

            sum += number;

        }
        System.out.println("The sum of the numbers are: " + sum);
    }
}