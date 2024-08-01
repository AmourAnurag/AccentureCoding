package AccentureCoding;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number which you find the factorail :");
        int number=sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        System.out.println("Fsctorisl of the number : "+fact);
    }
}
