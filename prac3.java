// 2 accept marks from user,if marks greater than 40,declare the student as "pass" else "fail"

import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {
        int s1;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter score ");
        s1=in.nextInt();
        if(s1>40)
        {
            System.out.println("PASS!");
        }
        else{
            System.out.println("FAIL!");

        }
        in.close();
        
    }
    
}
