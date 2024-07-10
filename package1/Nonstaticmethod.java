package package1;

public class Nonstaticmethod 
{
	void add() 
	{
    System.out.println("Addition");
	
	}
	void substract()
	{
	System.out.println("substraction");	
	}
 public static void main(String[] args) 
 {
   Nonstaticmethod n1= new Nonstaticmethod();
		   n1.add();
           n1.substract();
   
}
}

