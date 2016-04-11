package UserInterface;

import javax.swing.JButton;
import javax.swing.JPanel;
import Domain.*;

public class ContentUI extends JPanel {
	
	public JButton newStaffBT = new JButton("New Staff");
	public JButton assignSupervisorBT = new JButton("Assign Supervisor");
	public JButton deleteStaffBT = new JButton("Delete Staff");
	public JButton requestLeaveBT = new JButton("Apply Leave");
	public JButton requestViewBT = new JButton("Leave Request View");
	public JButton requestHandleBT = new JButton("Leave Request Handling");
	
	public ContentUI(Staff staff){
		
		if (staff.getdepartment().equals("Human Resource")) {
			this.add(newStaffBT);
			this.add(assignSupervisorBT);
			this.add(deleteStaffBT);
		} else {
			this.add(requestLeaveBT);
//			this.add(requestViewBT);
			this.add(requestHandleBT);
		}
	}
}
