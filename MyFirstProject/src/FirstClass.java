import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner1.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner1.nextInt();
        scanner1.nextLine();

        System.out.print("Are you a student(yes/no): ");
        String choice = scanner1.nextLine();

        System.out.println("Welcome " + name +'!');
        System.out.println("You are "+age+" years old");

        if (choice.equals("yes")){
            System.out.println("You're a student!");
        }
        else{
            System.out.println("You're NOT a student!");
        }
        scanner1.close();
    }
}