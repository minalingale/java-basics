//Assignment 30,31
package package1;

public class Math_randon_Aof_circle {
  static double pi_value= Math.PI;
  
	public static void main(String[] args)
	{
		
		/*for (int i=1;i<=10;i++)
		{
					System.out.println(Math.random());
	    }*/
		
		for (int i=1;i<=5;i++)
		{
		double r= Math.random();
		double Area=pi_value*r*r;
		System.out.println(Area);
		}
		
			
	}	
}
