//6. Basic calc using switch case
import java.util.Scanner;
public class prac6 {
    public static void main(String[] args) {
        float a, b,result=0;
        char h;
        Scanner obj = new Scanner(System.in);
        System.out.println("Select anyone operator \n (+ , - , * , /)");
        h= obj.next().charAt(0);
        System.out.println("Enter two numbers");
        a=obj.nextFloat();
        b=obj.nextFloat();
        switch(h)
        {
            case '+': result=a+b;
            break;
            case '-': result=a-b;
            break;
            case '*': result=a*b;
            break;
            case '/': result=a/b;
            break;

            default:
            System.out.println("ERROR SELECT VALID OPERATOR");
            
        }
        System.out.println(a+ " " +h+ " " +b+ " = " + result);
        obj.close();

    }
    
}
