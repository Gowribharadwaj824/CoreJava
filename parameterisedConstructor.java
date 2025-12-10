public class parameterisedConstructor {
	int id;
	String firstName;
	String lastName;
	double fees;

	parameterisedConstructor(int id, String firstName, String lastName, double fees) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fees = fees;
	}

	String getName() {
		return firstName + " " + lastName;
	}

	double getFees() {
		return fees;
	}

	public static void main(String args[]) {
		parameterisedConstructor s1 = new parameterisedConstructor(1, "Gowri", "Bharadawaj", 150000.0);
		parameterisedConstructor s2 = new parameterisedConstructor(1, "Nikhil", "Kashyapa", 100000.0);
		parameterisedConstructor s3 = new parameterisedConstructor(1, "Kshithi", "Kashyapa", 151000.0);

		System.out.println("Student 1   " + s1.getName() + "  Fees  " + s1.getFees());
		System.out.println("Student 2   " + s2.getName() + "  Fees  " + s2.getFees());
		System.out.println("Student 3   " + s3.getName() + "   Fees  " + s3.getFees());

	}
}