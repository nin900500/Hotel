package model;

public class Admin 
{
	String user, pass;
	public Admin(String user, String pass)
	{
		this.user = user;
		this.pass = pass;
	}
	
	public String getUser()
	{
		return user;
	}
	
	public String getPass()
	{
		return pass;
	}
	
	public static void main(String [] args)
	{
		Admin admin = new Admin("Manager","Hotel123");
	}
}
