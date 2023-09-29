import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
            System.out.println("Enter your age:");
            Scanner scan =  new Scanner(System.in);
            int age = scan.nextInt();

            int newPage =( 100 - age );
            System.out.println(age +" year olds should read at least " + newPage + " pages before giving up on a book.");
        }

    }

