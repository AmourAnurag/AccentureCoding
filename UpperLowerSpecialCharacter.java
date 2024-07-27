package AccentureCoding;

import java.util.Scanner;

public class UpperLowerSpecialCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        char ch = sc.next().charAt(0);
        int index=(int)ch;
        if (index>64 && index<91) {
            System.out.println("Entered charceter is lower case letter");
        }else if (index>96 && index < 123) {
            System.out.println("Entered charceter is capital letter ");
        }else{
            System.out.println("Entered character is special charecter");
        }
    }

}
