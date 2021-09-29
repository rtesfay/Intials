package first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        System.out.println("Enter your first name");
        firstName = input.next();
        System.out.println("Enter your last name");
        lastName = input.next();
       System.out.println("Your out put is: " + firstName.charAt(0) + lastName.charAt(0));
        //System.out.println("Your out put is: "+ firstName.indexOf(0)+lastName.indexOf(0));
        System.out.println(firstName.substring(0,1)+lastName.substring(0,1));

    }
}
