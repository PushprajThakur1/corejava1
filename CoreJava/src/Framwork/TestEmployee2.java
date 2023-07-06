package Framwork;

public class TestEmployee2 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Pushp", 18);
		Employee e2 = new Employee(2, "Rahul", 15);

		System.out.println(e1.hashCode());
		System.out.println(e1.hashCode());

		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e1));

	}
}
