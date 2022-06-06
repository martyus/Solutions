/* PersonTest is a Java application for testing the Person class */

public class PersonTest
{

	// Class variables to hold sample test values
	//
	private static String[] testNames = {"Trulli", "Baumgartner", "Montoya", 
					     "Sato", "Coulthard", "Barrichello",
					     "Schumacher", "Button", "Alonso",
					     "Fisichella", "Bruni", "Webber" };
	private static int[] testAges = {40, 26, 29, 27, 32, 31, 32, 37, 28, 30, 32, 32};


	//
	// The main() method is the entry point of this class
	//
	public static void main(String[] args)
	{
		//task 2
		Person[] people = new Person[testNames.length];

		for(int i = 0; i<people.length; i++){
			people[i] = new Person(testNames[i], testAges[i]);
		}

		System.out.println("\nThe original list of people is:\n");
		for(int i = 0; i<people.length; i++){
			System.out.println(people[i].getName() + " is " +people[i].getAge());
		}

		//task 3
		//sort by age
		Person.bSortByAge(people);
		//
		// Print sorted contents of array
		//
		System.out.println("\nThe sorted list of people is:\n");
		for(int i = 0; i<people.length; i++){
			System.out.println(people[i].getName() + " is " +people[i].getAge());
		}

		//sort by name
		Person.bSortByName(people);

		// Print sorted contents of array
		//
		System.out.println("\nThe sorted list of people is:\n");
		for(int i = 0; i<people.length; i++){
			System.out.println(people[i].getName() + " is " +people[i].getAge());
		}



	}

}
