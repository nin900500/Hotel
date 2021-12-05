package model;



/**
 * 
 * @author Jimmy Phan
 * @author Byron Voung
 * @author Aadit Dubey
 *
 */
public class Admin 
{
	String user, pass;
	/**
	 * Class for admin account that takes in two string 
	 * @param user
	 * @param pass
	 */
	public Admin(String user, String pass)
	{
		this.user = user;
		this.pass = pass;
	}
	
	/**
	 * Gets the username for the admin account
	 * @return the username
	 */
	public String getUser()
	{
		return user;
	}
	/**
	 * Gets the password for the admin account
	 * @return the passwords
	 */
	public String getPass()
	{
		return pass;
	}
	
	public static void main(String [] args)
	{
		Admin admin = new Admin("Manager","Hotel123");
	}
}
