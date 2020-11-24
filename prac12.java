//12.Java Program to demonstrate the use of the parameterized constructor.  
class prac12{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    prac12(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display()
    {
        System.out.println(id+" "+name);
    }  
    public static void main(String args[]){  
    //creating objects and passing values  
    prac12 s1 = new prac12(9,"harsh1");  
    prac12 s2 = new prac12(2,"harsh2");
    prac12 s3 = new prac12(5,"harsh3");  
    //calling method to display the values of object  
    s1.display();  
    s2.display(); 
    s3.display(); 
   }  
}  