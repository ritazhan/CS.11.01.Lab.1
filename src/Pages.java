import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner norris = new Scanner(System.in);
        System.out.println("Enter your age please:");
        int age = norris.nextInt();
        System.out.println(age + " year olds should read at least " + ( 100 - age ) + " pages before giving up on a book");
    }
}
