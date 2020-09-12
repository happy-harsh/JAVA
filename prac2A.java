public class prac2A{

public static void main(String args[])
{
    int sum=0;
    
    try{
        for(int i=0;i<args.length;i++)
        {
           sum=sum+Integer.parseInt(args[i]);

        }
        System.out.println(" SUM OF ENTERED ELEMENTS = "+sum);
    }
    catch (Exception e) 
    {System.out.println("#ERROR#\nEnter value as positive integers in the command line \n*TRY AGAIN*"); } 
    
}


}