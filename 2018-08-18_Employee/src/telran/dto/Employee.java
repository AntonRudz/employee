package telran.dto;

public class Employee {
public int id;
public String emailAddress;
public String name;
public String gender;
public String position;
public int salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(int id, String emailAddress, String name, String gender, String position, int salary) {
	super();
	this.id = id;
	this.emailAddress = emailAddress;
	this.name = name;
	this.gender = gender;
	this.position = position;
	this.salary = salary;
}
public Employee() {
	
}
@Override
public String toString() {
	return "Employee [id=" + id + ", emailAddress=" + emailAddress + ", name=" + name + ", gender=" + gender
			+ ", position=" + position + ", salary=" + salary + "]";
}

}
