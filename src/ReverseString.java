import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        String output = reverseString(input);

        System.out.println(output);


    }

    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder();

//        String[] words = input.split("");
//
//        System.out.println(Arrays.toString(words));

        for(int i = input.length() - 1; i >= 0; i-- ){

            stringBuilder.append(input.charAt(i));
        }

//        for (int i = words.length - 1; i >= 0; i--) {
//            stringBuilder.append(words[i]);
//        }

        return stringBuilder.toString();
    }
}
