package hotel;

public class User 
{
	public String usersName;
	public String usersPhoneNumber;
	public String usersEmail;
	

	public User(String userName,String usersPhoneNumber,String usersEmail)
	{
		this.usersName = usersName;
		this.usersPhoneNumber = usersPhoneNumber;
		this.usersEmail = usersEmail;
	}
	
	public String getName()
	{
		return this.usersName;
	}
	
	public String getPhoneNumber()
	{
		return this.usersPhoneNumber;
	}

}