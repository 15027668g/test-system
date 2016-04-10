package Domain;

import java.util.ArrayList;
import java.util.List;

public class Staff {
	
	private int id;
	private String password;
	private String name;
	private String department;
	private String title;
	private String supervisorID;
	private String supervisorName;
	private List<LeaveApp> leaveApplyList;

	

	public Staff(int id, String password, String name, String department, String title) {
	
		this.id = id;
		this.password = password;
		this.name = name;
		this.department = department;
		this.title = title;
	}
	
	public int getid() {
		return this.id;
	}
	public void setid(int id){
		this.id = id;
	}
	public String getpassword() {
		return this.password;
	}
	
	public void setpassword(String password){
		this.password = password;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getsupervisorID(){
		return this.supervisorID;
	}
	public void setsupervisorID(String supervisorID) {
		this.supervisorID = supervisorID;
	}
	public String getsupervisorName(){
		return this.supervisorName;
	}
	public void setsupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public List<LeaveApp> getLeaveApplyList() {
		return leaveApplyList;
	}
	public void setLeaveApplyList(List<LeaveApp> leaveApplyList) {
		this.leaveApplyList = leaveApplyList;
	}
	public void addLeaveApply(LeaveApp LeaveApp) {
		this.getLeaveApplyList().add(LeaveApp);
	}
	public void removeLeaveApply(LeaveApp LeaveApp) {
		this.getLeaveApplyList().remove(LeaveApp);
	}
	
}
