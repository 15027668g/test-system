package Domain;

public class HR {
	private int staffNo = 0; 
	
	Staff[] staff = new Staff[1000]; {
		staff[staffNo]= new Staff();
	}
/*	public void setid() {
		System.out.println(staffNo);
		this.staffNo ++;
	} */
	
	public void newStaff(String name,String department,String title, int age) {
		this.staff[staffNo].setid(this.staffNo);
		this.staff[staffNo].setName(name);
		this.staff[staffNo].setage(age);
		this.staff[staffNo].setdepartment(department);
		this.staff[staffNo].settitle(title);
		
		System.out.println(this.staff[staffNo].getid());
		System.out.println(this.staff[staffNo].getName());
		System.out.println(this.staff[staffNo].getage());
		System.out.println(this.staff[staffNo].getdepartment());
		System.out.println(this.staff[staffNo].gettitle());
		
		this.staffNo++;
		staff[staffNo]= new Staff();
	}
	
	public void deleteStaff() {
		
	}
}
