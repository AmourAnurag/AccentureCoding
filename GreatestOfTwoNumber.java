package AccentureCoding;

import java.util.Scanner;

public class GreatestOfTwoNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first number ");
        int num1=sc.nextInt();
        System.out.println("Please enter the second number ");
        int num2=sc.nextInt();
        if (num1>num2) {
            System.out.println(num1+" is the greater number ");
        }else{
            System.out.println(num2+" is the greater number");
        }
    }
}
