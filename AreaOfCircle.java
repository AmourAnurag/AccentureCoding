package AccentureCoding;
import java.util.*;
public class AreaOfCircle {
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radiuos of the cirle ");
    int radiuos=sc.nextInt();
    if (radiuos>0) {
        System.out.println("Area of the circle is "+(3.14*radiuos*radiuos));
    }else{
        System.out.println("Please enter the suitable radiuos");
    }

  }
    
}
