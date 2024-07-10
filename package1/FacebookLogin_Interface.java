//Inhereite  2 intercace using implements
package package1;

interface Email
{
 void Email_un();

}

interface Mobile_no
{
void Mobile_no_login();


}

public class FacebookLogin_Interface implements Email,Mobile_no
{
	
	public void Mobile_no_login()
	{
		System.out.println("Test1");
	}
	public void Email_un() 
	{
		System.out.println("TEst2");
	}
public static void main(String[]args)
    {
	FacebookLogin_Interface f1= new FacebookLogin_Interface();
	f1.Email_un();
	f1.Mobile_no_login();	
    }


}
