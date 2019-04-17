import java.util.ArrayList;
import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) 
	{
	  int num;
	  System.out.println("Enter Decimal Number");
	  Scanner s = new Scanner(System.in);
	  num = s.nextInt();
	  ArrayList al = new ArrayList();
	 
	  while(num != 0)
	  {
		int x = num % 16;
		if(x == 10)
		{
			al.add("A");	
		}
		else if(x == 11)
		{
			al.add("B");	
		}
		else if(x == 12)
		{
			al.add("C");	
		}
		else if(x == 13)
		{
			al.add("D");	
		}	
		else if(x == 14)
		{
			al.add("E");	
		}	
		else if(x == 15)
		{
			al.add("F");	
		}	
		else
			al.add(x);
		num = num / 16;
      }
	  for(int i = al.size()-1;i >= 0;i--)
	  {
		System.out.print(al.get(i));  
	  }
	}

}
