//8. Accept and display the string entered and execute atleast 5 different functions to it
import java.util.Scanner;
public class prac8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a first string");
        String str1 = obj.nextLine();
        System.out.println("Enter a second string");
        String str2 = obj.nextLine();
        

        // Length of a string
        System.out.println("\n string1 length is: " +str1.length());  
        System.out.println(" string2 length is: " +str2.length());

        //Concatinating strings contents of string 1 at end of string 2
        String str3 = str2.concat(str1);
        System.out.println("\n Contenated string is: " +str3);
        
        //Comparing string1 with string2
        System.out.println("\n Comparing string: ");
        System.out.println(str1.compareTo(str2));

        //Checking whether a string is empty or not
        System.out.println("\n Checking whether a string is empty or not");
        System.out.println( str1.isEmpty());      // true
        System.out.println( str2.isEmpty());      //false

        //Lowercase and uppercase string 
        System.out.println("\n Lowercase of string1 and 2");
        String str1lower=str1.toLowerCase();
        System.out.println( str1lower);
        String str2lower=str2.toLowerCase();
        System.out.println( str2lower);

     System.out.println("\n Uppercase of string 1 and 2 ");
        String str1upper=str1.toUpperCase();  
        System.out.println( str1upper);
        String str2upper=str2.toUpperCase();  
        System.out.println( str2upper);    
        obj.close();

    }
    
}
