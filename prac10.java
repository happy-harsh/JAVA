//10.Define a class, describe its constructor, overload the Constructors and instantiate its object.
class prac10{
    int  value1;
    int  value2;
    prac10(){
     System.out.println("Inside default Constructor");
     value1 = 10;
     value2 = 20;
   }
   prac10(int a){
    
    System.out.println("Inside paramaterized Constructor1");
    value1 = a;
  }
  prac10(int a,int b){
  
  System.out.println("Inside paramaterized Constructor2");
  value1 = a;
  value2 = b;
 }
 public void display(){
    System.out.println("Value1 === "+value1);
    System.out.println("Value2 === "+value2);
}
public static void main(String args[]){
  prac10 d1 = new prac10();
  d1.display();
  prac10 d2 = new prac10(30);
  d2.display();
  prac10 d3 = new prac10(30,40);
  d3.display();
}
}
