package org.emp;
public class Employee {
	private void empId() {
		System.out.println("Emp ID: 123");
	}
	private void empName() {
		System.out.println("Emp Name: Viji");
	}	
	private void empDob() {
		System.out.println("Emp DOB: 25-03-2022");
	}
	private void empPhone() {
		System.out.println("Emp PhoneNo: 8973480780");
	}
	private void empEmail() {
		System.out.println("Emp Email: vijir@gmail.com");
	}
	private void empAddress() {
		System.out.println("Emp Address: Vijayamangalam, Erode");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();		
	}
}
