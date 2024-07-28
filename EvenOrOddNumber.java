package AccentureCoding;
import java.util.*;
public class EvenOrOddNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=sc.nextInt();
        if (number%2==0) {
            System.out.println(number+" is a even nummber");
        } else {
            System.out.println(number+" is a odd nummber");

        }
    }
}
