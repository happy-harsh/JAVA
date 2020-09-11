
import java.io.DataInputStream;
class prac2
{
public static void main(String args[])
{

DataInputStream in = new DataInputStream(System.in);
int num1=0;
int num2=0;
try

{
System.out.print("Enter the value of first integer  number = ");
num1=Integer.parseInt(in.readLine());
System.out.print("Enter the value of first integer  number = ");
num2=Integer.parseInt(in.readLine());
int sum;
sum=num1+num2;
System.out.println("Addition of numbers is ="+sum);


}
catch (Exception e) 
{System.out.println("*Invalid input enter value as positive integers* \n TRY AGAIN "); }

}
}