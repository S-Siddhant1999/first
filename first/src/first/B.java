package first;

interface A1
{
	int x=100;
	void display();
	
}

interface A2
{
	int x=200;
	void display();
}

public class B implements A1,A2
{
	public void display()
	{
		System.out.println("hello from main display");
	}
	public static void main(String args[])
	{
		B b=new B();
		b.display();
		System.out.println(A1.x);
		System.out.println(A2.x);
	}

}
