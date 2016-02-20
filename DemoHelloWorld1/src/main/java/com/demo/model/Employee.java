package com.demo.model;

public class Employee {

	String firstName;
	int age;
	double salary;
	String destination;

	public Employee(String firstName) {
		this.firstName = firstName;
	}

	public void setName(String firstName) {
		this.firstName = firstName;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		// Employee employee1 = new Employee("Daniel");
		// employee1.setAge(22);

		Employee employee2 = new Employee("Poonam");
		employee2.setAge(15);
		System.out.println("15");

		Employee employeeFirstName = new Employee("");
		employeeFirstName.setName("John");

		Employee employeeFirstName2 = new Employee("");
		employeeFirstName2.setName("Shamo");

		Employee employeeFirstName3 = new Employee("");
		employeeFirstName3.setName("Hiren");

		// Employee employeeAge = new Employee ("Daniel");

		Employee employee7 = new Employee("John");
		employee7.setName("John");
		System.out.println("John");
		// employeeAge.getAge("Daniel");

		String age11;
		// int age11 = age11 ;

		// for (age11 = 0 ;age11 < age11 ;age11 ++)

		{
			// System.out.println(age11);

		}

		// System.out.println("Hiren");
		System.out.println("Daniel");
	}

	private void getfirstName1(String string) {

		// TODO Auto-generated method stub

	}

	// static String name = "Dan";
	// private Object ;
	// Employee employeeName = new Employee ("Dan");
	// employeeName.Employee = "Dan";
	// System.out.println("Daniel");

}
