package Domain;

public class HR {
	private int staffNo = 0; 
	
	Staff[] staff = new Staff[1000]; {
		staff[staffNo]= new Staff();
	}
	public String[] staffNameArray;
	
	public String[] getstaffNameArray() {
		return staffNameArray;
	}
	
/*	public void setid() {
		System.out.println(staffNo);
		this.staffNo ++;
	} */
	
	public void newStaff(String name,String department,String title, int age, String supervisorID) {
		this.staff[staffNo].setid(this.staffNo);
		this.staff[staffNo].setName(name);
		this.staff[staffNo].setage(age);
		this.staff[staffNo].settitle(title);
		this.staff[staffNo].setdepartment(department);
		this.staff[staffNo].settitle(title);
		this.staff[staffNo].setsupervisorID(supervisorID);
		
		if (title == "Director") {
			this.staff[staffNo].setdepartment("Not applicable");
			this.staff[staffNo].setsupervisorID("No supervisor assigned for Director");
		} else {
			this.staff[staffNo].setdepartment(department);
			this.staff[staffNo].setsupervisorID(supervisorID);
		}
		
//		this.staffNameArray[staffNo] = this.staff[staffNo].getName();
		System.out.println(this.staff[staffNo].getid());
		System.out.println(this.staff[staffNo].getName());
		System.out.println(this.staff[staffNo].getage());
		System.out.println(this.staff[staffNo].getdepartment());
		System.out.println(this.staff[staffNo].gettitle());
		System.out.println(this.staff[staffNo].getsupervisorID());
		
		this.staffNo++;
		staff[staffNo]= new Staff();
	}
	
	public void deleteStaff() {
		
	}
}
