package AccentureCoding;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
        System.out.println("enter the number where you want to sum of natural number");
        int n=sc.nextInt();
        long sum=(n*(n+1))/2;
        System.out.println("Sum = "+sum);
    }
}
