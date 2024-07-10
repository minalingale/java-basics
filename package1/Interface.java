//Assi 49
package package1;
interface Amazon
{
	void login_with_email_id1();
	void login_with_phone_no();
	
}



public class Interface implements Amazon
{
	public void login_with_email_id1()
{
	System.out.println("Test");
	
}
public void login_with_phone_no()
{
	System.out.println("Test11");
}
public static void main(String[]args)
{
	Interface I1 = new Interface();
	I1.login_with_email_id1();
	I1.login_with_phone_no();


}

}
