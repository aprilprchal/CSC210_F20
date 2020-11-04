import java.util.Comparator;

/** General person class with basic information.*/
public class Person implements Comparable<Person> {

	/** static variable for creating a unique id */
	private static Integer nextID = 10001;
	private Integer getID() {
		return nextID++;
	}

	String lastName;
	String firstName;
	/** unique identification number */
	final Integer id;
	/** age in years */
	int age;
	/** birth month: 1=jan, 2=feb, ... */
	int birthMonth;


	public Person(String last, String first, int age, int month) {
		lastName(last);
		firstName(first);
		age(age);
		birthMonth(month);
		id = getID();
	}

	public String toString() {
		return (id+": "+lastName+" "+firstName+" "+age+" years old. Bday month="+birthMonth);
	}

	@Override
	public int compareTo(Person other) {
		return id - other.id;
	}


	@Override
	public boolean equals(Object other) {
		// Check if it is the same object, the same type of object.
		// Then check if the id's are the same (and only the id's)
		// Look at the Song.equals method for an example.
		if (this==other) {
			return true;
		}
		if (!(other instanceof Person)) {
			return false;
		}
		Person p = (Person) other;
		return id==p.id;
	}

	public void lastName(String n) { lastName = n; }
	public String lastName() { return lastName; }

	public void firstName(String n) { firstName = n; }
	public String firstName() { return firstName; }

	// getter only for ID
	public int id() { return id; }

	public void age(int a) { age = a;}
	public int age() { return age; }

	public void birthMonth(int m) {
		if (m<1 || m>12) { return;}
		birthMonth = m;
	}
	public int birthMonth() { return birthMonth; }


}
