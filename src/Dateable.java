import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner diddy = new Scanner(System.in);
        System.out.println("Enter your age please:");
        int age = diddy.nextInt();
        System.out.println(age + " year olds should date someone at least " + ( 7 + ( age / 2 ) ));
    }
}
