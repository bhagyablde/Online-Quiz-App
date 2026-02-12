import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== Welcome to Online Quiz =====");

        // Question 1
        System.out.println("\n1. Which language is used for Android Development?");
        System.out.println("A. Python");
        System.out.println("B. Java");
        System.out.println("C. C++");
        System.out.println("D. HTML");
        System.out.print("Enter your answer: ");
        String ans1 = sc.nextLine();

        if(ans1.equalsIgnoreCase("B")) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which keyword is used to inherit a class in Java?");
        System.out.println("A. this");
        System.out.println("B. super");
        System.out.println("C. extends");
        System.out.println("D. implements");
        System.out.print("Enter your answer: ");
        String ans2 = sc.nextLine();

        if(ans2.equalsIgnoreCase("C")) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which database is commonly used with Java?");
        System.out.println("A. MySQL");
        System.out.println("B. Excel");
        System.out.println("C. Notepad");
        System.out.println("D. Paint");
        System.out.print("Enter your answer: ");
        String ans3 = sc.nextLine();

        if(ans3.equalsIgnoreCase("A")) {
            score++;
        }

        // Question 4
        System.out.println("\n4. Which company developed Java?");
        System.out.println("A. Microsoft");
        System.out.println("B. Apple");
        System.out.println("C. Sun Microsystems");
        System.out.println("D. Google");
        System.out.print("Enter your answer: ");
        String ans4 = sc.nextLine();

        if(ans4.equalsIgnoreCase("C")) {
            score++;
        }

        // Question 5
        System.out.println("\n5. What is JVM?");
        System.out.println("A. Java Virtual Machine");
        System.out.println("B. Java Variable Method");
        System.out.println("C. Joint Virtual Memory");
        System.out.println("D. None");
        System.out.print("Enter your answer: ");
        String ans5 = sc.nextLine();

        if(ans5.equalsIgnoreCase("A")) {
            score++;
        }

        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Your Score: " + score + "/5");

        if(score == 5) {
            System.out.println("Excellent!");
        } else if(score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}
