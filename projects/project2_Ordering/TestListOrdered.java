import java.util.Comparator;

public class TestListOrdered {




	public static void main(String[] args) {
		ListOrdered<Olympian> athletes = new ListOrdered<>();
		try {
			LoadOlympians.load(athletes,"subset.csv");
		} catch(Exception e) {
			System.out.println("not right");
			return;
		}
		System.out.println(athletes);
	}
}
