package AccentureCoding;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number =sc.nextInt();
        int reverseNumber=0;
        while(number>0){
              int rem=number%10;
              reverseNumber=reverseNumber*10+rem;
              number/=10;
        }
       System.out.println("Reverse of the number :"+reverseNumber);
    }
}
