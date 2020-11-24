//18.Implement Multiple Inheritance using interface
interface demo // interface
{
	static final double pi=3.14;
	public void disp(); // function declaration
}
class Def
{
	int i=22;
	void disp1()
	{
		System.out.println("In disp1 function:");
	}
}
class prac13 extends Def implements demo
{
	public void disp() // function definition
	{
		System.out.println("In disp function:");
	}
	public static void main(String[] args)
	{
		prac13 obj =new prac13();
		obj.disp1();
		obj.disp();
	}
    
}

