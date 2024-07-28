package AccentureCoding;

import java.util.Scanner;

public class SumOfDigitOfNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        long number = sc.nextInt();
        int sum=0;
        while (number>0) {
            sum+=number%10;
            number=number/10;
            
        }
        System.out.println("Total digits "+sum);
    }
}
