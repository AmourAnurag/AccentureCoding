package AccentureCoding;
import java.util.*;
public class PositiveOrNegativeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       try {
          System.out.println("Please enter a number ");
          int number =sc.nextInt();
          if (number>0) {
                System.out.println("Entered number "+number+" is a positive number ");
            }else{
                System.out.println("Entered number "+number+" is a negative number ");
            }
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Please enter a valid number ");
       }
        // i
    }
}
