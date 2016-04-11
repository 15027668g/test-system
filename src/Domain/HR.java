package Domain;

public class HR {
	private int staffNo = 0; 
	
	Staff[] staff = new Staff[1000]; {
		for (int i = 0; i < 1000; i++){
			staff[i] = new Staff(i, "null", "null", "null", "null");
		}		
		//0..
		staff[staffNo]= new Staff(staffNo, "1234", "admin", "Human Resource", "Senior manager");
		//1st
		staff[++staffNo] = new Staff(staffNo, "1234", "Ben", "Engineering", "Director");
		//2nd
		staff[++staffNo] = new Staff(staffNo, "1234", "John", "Administration", "Senior manager");
		staff[staffNo].setsupervisorID("1");
		//3rd
		staff[++staffNo] = new Staff(staffNo, "1234", "Kevin", "Administration", "Senior manager");
		staff[staffNo].setsupervisorID("2");
		//4th
		staff[++staffNo] = new Staff(staffNo, "1234", "Steven", "Administration", "Senior manager");
		staff[staffNo].setsupervisorID("3");
	}
	
	
	public Staff[] getstaffArray() {
		return staff;
	}

}
