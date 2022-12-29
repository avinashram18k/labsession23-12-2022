/*Write a Program create 2 Interfaces 'Printable' and 'Calculate'and 
 * use these 2 interfaces in 2 different in 2 different classes one will calculate square and another will calculate cube*/


package newpackage;

interface Printable
{
	void show();
}
interface Calculate
{
	int calcu(int i);
}
class Cal_square implements Printable,Calculate
{
	public void show()
	{
		System.out.println("Square of a Number is =");
	}
	
	public int calcu(int a)
	{
		return a*a;
	}
	
}
class Cal_cube implements Printable,Calculate
{
	public void show()
	{
		System.out.println("Cube of a Number is=");
	}
	public int calcu(int a)
	{
		return a*a*a;
	}
}





public class InterfaceExample {

	public static void main(String[] args) {
		Cal_square cq=new Cal_square();
		cq.show();
		System.out.println(cq.calcu(2));
		Cal_cube cc=new Cal_cube();
		cc.show();
		System.out.println(cc.calcu(3));	
		
	}

}
