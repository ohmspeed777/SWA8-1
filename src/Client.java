
public class Client {
	public static void main(String[] args) {
		Person join = new Person("Mr.", "John", 25);
		Employee emp = new Employee(join, 50000);
		emp.showDetail();
	}
}
