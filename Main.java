import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! What is your name?");

        String name = sc.nextLine();

        System.out.println("\nHi, " + name + ". I am JavaBot " + "! Where are you from?");

        String user_home = sc.nextLine();

        System.out.println("\nI heard " + user_home + " is a beautiful place. I am from a place called Oracle!");

        System.out.println("\nHow old are you?");

        int user_age = sc.nextInt();

        System.out.println("\nSo you're " + user_age + " years old. I am 400 years old.");

        System.out.println("\nThis means I am " + (400 / user_age) + " times older than you.");

        System.out.println("\nEnough about me. What's your favourite programming language?(Just don't say Python 😂)");

        sc.nextLine();

        String user_favLang = sc.nextLine();

        System.out.println("Ahh! " + user_favLang + ", that's great! It was nice chatting with you " + name
                + ", I have to log off now 😎");
        sc.close();

    }
}
