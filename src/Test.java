import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String []Args){
//      This part is the easy scanner example
//        String name = "";
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Please enter in a name: ");
//        name = keyboard.next();
//        System.out.println(name);
        Random randomnumber = new Random();
        int x = 50;
        int number = (randomnumber.nextInt(x));
        System.out.println(number);
    }
}
