package AccentureCoding;
import java.util.*;
public class SumInGivenRange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting range : ");
int start=sc.nextInt();
System.out.println("Enter the limit of the range : ");
int end=sc.nextInt();
int sum=(end*(end+1))/2-(start*(start+1))/2+start;
System.out.println(sum);
    }
}
