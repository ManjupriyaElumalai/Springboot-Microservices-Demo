package Java8Samples;

public class Employee {

	int id, salary, exp;
	String name;
	public Employee(int id, int salary, int exp, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.exp = exp;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", exp=" + exp + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
