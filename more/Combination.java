//This is to print all the combinations of string
import java.util.*;
public class Combination
{
	TreeSet<String> output=new TreeSet<String>();//this contain final output
	public static void main(String[] args)
	{
		Combination classObject=new Combination();
		TreeSet<String> ts=new TreeSet<String>();//This contain initial initial combinations
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to print combination:");
		String s=sc.nextLine();
		ts.add(s);
		ts.addAll(classObject.swaper(s));
		classObject.output.addAll(ts);
		for(String v:ts)
		{
			classObject.output.addAll(classObject.combi(v));
		}
		System.out.println("Total combination found are: "+classObject.output.size());
		for(String v:classObject.output)
		{
			System.out.println(v);
		}
	}
//	-----------------------------------------------------
	TreeSet<String> swaper(String ss)
	{
		TreeSet<String> ttss=new TreeSet<String>();
		char[] ch=new char[ss.length()];
		for(int i=0;i<ss.length();i++)
		{
			ch[i]=ss.charAt(i);
		}
		for(int j=1;j<ss.length();j++)
		{
			char temp=ch[0];
			ch[0]=ch[j];
			ch[j]=temp;
			String x=String.valueOf(ch[0]);
			for(int i=1;i<ss.length();i++)
			{
				x=x+ch[i];
			}
			ttss.add(x);
		}
		return ttss;
	}
//	---------------------------------------------------------
	TreeSet<String> combi(String str)
	{
		String first;
		TreeSet<String> temp=new TreeSet<String>();
		TreeSet<String> main=new TreeSet<String>();
		TreeSet<String> recieved=new TreeSet<String>();
		first=String.valueOf(str.charAt(0));
		str=str.substring(1);
		if(str.length()>2)
		{
			temp.add(str);
			temp.addAll(swaper(str));
			for(String s:temp)
			{
				main.add(first+s);
				recieved=combi(s);
				for(String r:recieved)
				{
					main.add(first+r);
				}
			}
			return main;
		}
		if(str.length()==2)
		{
			temp.add(first+String.valueOf(str.charAt(1))+String.valueOf(str.charAt(0)));
			return temp;
		}
		return main;
	}
}