package Beanclass;

public class Employee {

	private int eid ;
	private String name ;
	private String address ;
	private int salary ;
	public int getEid() {
		return eid;
	}
	
	public Employee(int eid, String name, String address, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
