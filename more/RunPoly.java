class A
{
	public void disp()
	{
		System.out.println("Hello this disp in A class");
	}
}
public class RunPoly extends A
{
	public static void main(String[] args)
	{
		A rp=new RunPoly();
		rp.disp();
	}
	public void disp()
	{
		System.out.println("Hello this is disp in RunPoly class");
	}
}
