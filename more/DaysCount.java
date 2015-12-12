import java.util.Scanner;
public class DaysCount
{
	enum months
	{
		Jan(31),
		Feb(28),
		Mar(31),
		Apr(30),
		May(31),
		June(30),
		July(31),
		Aug(31),
		Sep(30),
		Oct(31),
		Nov(30),
		Dec(31);
		private int value;  
		private months(int value)
		{  
			this.value=value;
		}
	}
	static public void main(String[] var)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Date (Example [1/Apr/2015)");
		String start=sc.nextLine();
		start=start.concat("/");
		System.out.println("Enter End Date (Example [1/June/2015)");
		String end=sc.nextLine();
		end=end.concat("/");
		
		
		
	}
}
