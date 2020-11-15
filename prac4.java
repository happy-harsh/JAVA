// 4 Display sum of first 10 even numbers using do-while loop
public class prac4{
    public static void main(String[] args) {
        int x=0,sum=0;
       do{
           sum=sum+x;
           x=x+2;
       }while(x<=20);
       System.out.println("Sum of first 10 even numbers is "+sum);

    }
    
}
