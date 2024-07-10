//Ass 70
package package1;

import java.util.Arrays;
import java.util.Scanner;

public class StringScanner
{
	
			

	public static void main(String[] args) 
	{
		Scanner s2 = new Scanner(System.in);
	
		int rollno[]= new int[5];
		for(int i=0;i<rollno.length;i++)
		{
			
			rollno[i]= s2.nextInt();
			
			
			
		}
		
		System.out.println(Arrays.toString(rollno));
		
		
	}

}