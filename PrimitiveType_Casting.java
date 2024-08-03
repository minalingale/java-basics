package Collection;

public class PrimitiveType_Casting 
{
	public static void main(String[] args)
	{
		int a=100;
		double wt=a;//converting int into double( widening-impicit manner)
		System.out.println(wt);
		double wt1 =(double)23;//converting int into double( widening-explicit manner)
		System.out.println(wt1);
		
		
		int a1= (int) 9.8872; //converting double into int( narrowing-explicit manner)
		System.out.println(a1);
		
		byte b1=127;//converting byte into int widening
		int c1=b1;
		System.out.println(c1);
		
		int d1=353952523;//covert into datatype into byte datatype (narrwoing explicit)
		byte d2= (byte) d1;
		System.out.println(d2); 
		
		double d3=1.92847349873843748;
		float d4 =(float) d3;
		System.out.println(d4);//converting double into float(narrowing)
		
	

	}

}
