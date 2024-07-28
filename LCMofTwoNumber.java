package AccentureCoding;

import java.util.Scanner;

public class LCMofTwoNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1=sc.nextInt();
        System.out.println("enter the second number ");
        int num2=sc.nextInt();
        num1=Math.min(num1, num2);
        num2=Math.max(num1, num2);
        int LCM=num1*num2;
        int HCF=1;
        while (true) {
            int rem=num2%num1;
            if (rem==0) {
                HCF=num1;
                break;
            }
            int tmp=num1;
            num1=rem;
            num2=tmp;
        }
        LCM/=HCF;
        System.out.println("HCF of both number "+HCF);
        System.out.println("LCM of both number "+LCM);

    }
}
