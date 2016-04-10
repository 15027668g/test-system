package Domain;

public class LeaveApp {
	public String startDate;
	public String endDate;
	public Boolean leaveEndorsed;
	public int staffid;
	
	
	public LeaveApp(String startDate, String endDate, int staffid) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveEndorsed = null;
		this.staffid = staffid;
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
		return this.staffid;
	}
	public void setStaffid(int staffid){
		this.staffid = staffid;
	}
	
	public boolean getleaveEndorsed(){
		return this.leaveEndorsed;
	}
	public void setleaveEndorsed(boolean leaveEndorsed){
		this.leaveEndorsed = leaveEndorsed;
	}

}
