public class People {
	public static void main(String[] args) {
		// Create a new list
		OrderedList<Person> people = new OrderedList<Person>();

		// Add some people
		people.add(new Person("smith","joseph",50,8));
		people.add(new Person("nunes","isa",20,4));
		people.add(new Person("lui","sunny",30,1));
		people.add(new Person("nunes","milo",25,10));

		// See how they are ordered
		System.out.println(people);

		// Try to find someone
		Person object = people.find(new Person("lui","sunny",30,1));
		System.out.println("Find(lui)="+object);
	}
}
