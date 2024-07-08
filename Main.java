import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("enter no 1: ");
//        int no1 = input.nextInt();
        System.out.println("A password must have at least ten characters.\n" +
                "A password consists of only letters and digits.\n" +
                "A password must contain at least two digits.");
        System.out.println("enter password: "); //pass Question
        String no1 = input.nextLine();
//        System.out.println("enter no 2: ");
//        int no2 = input.nextInt();
//        System.out.println("enter no 3: ");
//        int no3 = input.nextInt();
//        System.out.println(SmallestNo(no1,no2,no3));
//        System.out.println(Numbers(no1));

        System.out.println(Passwords(no1));

    }

    //    public static int SmallestNo(int no1, int no2 , int no3) {
//        int smallest = no1;
//        if (no2 < smallest) {
//            smallest = no2;
//        }
//        if (no3 < smallest) {
//            smallest = no3;
//        }
//        return smallest;
//    }
//Write a Java method that check if the entered number is
//    negative or positive or zero.
//    public static int Numbers(int no1) {
//        if (no1 > 0) {
//            System.out.println("number is positive");
//        }
//        if (no1 < 0) {
//            System.out.println("number is negative");
//        }
//        if (no1 == 0) {
//            System.out.println("number is zero");
//        }
//            return no1;
//        }
//    3 - Write a Java method to check whether a string is a valid password.
//    Password rules:
//    A password must have at least ten characters.
//    A password consists of only letters and digits.
//    A password must contain at least two digits
    public static Boolean Passwords(String no1) {

        if (no1.length() < 8) {
            System.out.println("Password must have at least 10 characters.");
            return false;
        }

        if (!no1.matches("[a-zA-Z0-9]*")) {
            System.out.println("Password must consist of only letters and digits.");
            return false;
        }

        String digitsOnly = no1.replaceAll("[^0-9]", "");
        if (digitsOnly.length() < 2) {
            System.out.println("Password must contain at least two digits.");
            return false;
        }

        return true;
    }
    }

