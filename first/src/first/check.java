package first;
interface A
{
default void show()
{
System.out.println("hello from A interface");	
}
}
interface B
{
/*default void show()
{
System.out.println("hello from B interface");	
}*/
}
public class check implements A,B {

	public static void main(String[] args) {
		check c=new check();
		c.show();
	
		
		// TODO Auto-generated method stub

	}

}
