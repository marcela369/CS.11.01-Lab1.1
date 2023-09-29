import java.util.*;
public class Dateable {

    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner scan =  new Scanner(System.in);
        int age = scan.nextInt();

        int newAge =  ( 7 + ( age / 2 ) );
        System.out.println(age+"-year olds should date somebody who is at least " + newAge +" years old");
    }

}

