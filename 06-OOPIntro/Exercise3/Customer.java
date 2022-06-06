/* Class for customer */

public class Customer {

	// Instance variables to hold customer's name and account number
	private String name;
    private int accountNumber;
    private char status;
    //class variable
    private static int lastUsedAccount = 1000;


	//
	// Constructor that takes a String to initialise the instance variable for the customer's
	// name, and sets the status automatically to 'A' as a default value
	//
	public Customer(String name)
	{
		this.name = name;
		this.status = 'A';
		this.accountNumber = lastUsedAccount;
		lastUsedAccount ++;
	}

	public Customer(String name, char status){
		this(name);
		if (status!= 'A' && status != 'I' && status!= 'H'){
			this.status = 'H';
		}
		else{
			this.status = status;
		}
	}

	//
	// The getName method returns the name
	//
    public String getName()
    {
		return name;
	}


	//
	// The getAccountNumber method returns the accountNumber
	//
    public int getAccountNumber()
    {
		return accountNumber;
	}



	public char getStatus(){
		return status;
	}

	public boolean isHeld(){
		if(status == 'H'){
			return true;
		}
		else return false;
	}



	//
	// This changeDetails method changes the name
	//
    public void changeDetails(String name)
    {
		this.name = name;
	}


	//
	// ToDo:
	//
	// Provide a second changeDetails method that changes the name and status
	//
	public void changeDetails(String name, char status){
		this.name = name;
		this.status = status;
	}


	//
	// ToDo:
	//
	// Provide a class method, setLastUsedAccountNumber(), to reset the class variable
	//
	public static void setLastUsedAccountNumber(int newNumber){
		Customer.lastUsedAccount = newNumber;
	}




}