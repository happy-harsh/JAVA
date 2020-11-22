//11.Illustrate method overloading

public class prac11 {
    double   result ;
    double areac(int a)
    {
        result = 3.14* a * a ;
        return result;
    }
    double areac(int a , int b)
    {
        result = a * b;
        return result;
    }
    double areac(int a , int b , int c)
    {
        result = a *b *c;
        return result;
    }
   
    public static void main(String[] args) {
        prac11 obj = new prac11();
        double  a , b , c;
        a=obj.areac(2);
        System.out.println("area of circle is " + a);
        b=obj.areac(2,3);
        System.out.println("area of rectangle is "+b);
        c= obj.areac(2,3,5);
        System.out.println("volume of cuboid is "+ c);
       

    }
}
