package Domain;

public class Staff {
	
	private int id;
	private String name;
	private String lastName;
	private int age;
	private String department;
	private String title;

	public int getid() {
		return this.id;
	}
	
	public void setid(int id){
		this.id = id;
	}
/*	public AbstractStaff(String FirstName, String LastName) {
		this.firstName = FirstName;
		this.lastName = LastName;
	} */
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String LastName){
		this.lastName = LastName;
	}
	public int getage(){
		return this.age;
	}
	public void setage(int age){
		this.age = age;
	}
	public String getdepartment() {
		return this.department;
	}
	public void setdepartment(String department){
		this.department = department;
	}
	public String gettitle(){
		return this.title;
	}
	public void settitle(String title) {
		this.title = title;
	}
}
