package AccentureCoding;
//dectate entered alphabet is vowel consotant
import java.util.*;
public class CharacterOrVowel {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch=sc.next().charAt(0);
        int index=(int)ch;
        if (index>64 && index<123) {
            if (index>96) {
                index=index-32;
            }
            if (index==65||index==69||index==73||index==79||index==85) {
                System.out.println("Entered alphabet is a vowel");
            }else{
                System.out.println("Entered alphabet is a consonant");
            }
        }else{
            System.out.println("Please enter a valid chatacter");
        }
    }
}