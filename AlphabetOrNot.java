//check entered character is alphabet or not

package AccentureCoding;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the charater ");
        char ch=sc.next().charAt(0);
        int index=(int)ch;
        if (index>64 && index <91) {
            System.out.println("Entered characeter is Capital alphabet");
        }else if (index>89 && index<123) {
            System.out.println("Enterede alphabet is lower case letter ");
        }else{
            System.out.println("Please enter a valid characetr");
        }
    }
}
