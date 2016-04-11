package Domain;

public class LeaveApp {
	public String startDate;
	public String endDate;
	public int leaveEndorsed;
	public int applicantid;
	
	
	public LeaveApp(String startDate, String endDate, int applicantid) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveEndorsed = 2;
		this.applicantid = applicantid;
	}
	public String getStartDate(){
		return this.startDate;
	}
	
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
	
	public String getEndDate(){
		return this.endDate;
	}
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
	public int getStaffid(){
		return this.applicantid;
	}
	public void setStaffid(int staffid){
		this.applicantid = staffid;
	}
	
	public int getleaveEndorsed(){
		return this.leaveEndorsed;
	}
	public void setleaveEndorsed(int leaveEndorsed){
		this.leaveEndorsed = leaveEndorsed;
	}

}
