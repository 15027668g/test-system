package UserInterface.Staff;


import java.awt.GridLayout;
import javax.swing.*;

import Domain.LeaveApp;
import Domain.Staff;

public class requestLeaveUI  extends JPanel{
	public JTextField startDateTF = new JTextField();
	public JTextField endDateTF = new JTextField();
	public JButton acknowledgeBT = new JButton("Acknowledge");
	
	public requestLeaveUI(Staff staff){
		
	JLabel startDateJL = new JLabel("Leave Start Date: ");	
	JLabel endDateJL = new JLabel("Leave End Date: ");
	JLabel DateFormat1JL = new JLabel("Start Date Format: ");
	JLabel DateFormat2JL = new JLabel("YYYY/MM/DD");
	JLabel DateFormat3JL = new JLabel("Leave Date Format: ");
	JLabel DateFormat4JL = new JLabel("YYYY/MM/DD");
	
	JLabel remindApplying = new JLabel("Leave applying, please wait for endorsement...");
	JLabel successApply = new JLabel("Leave applied successfully");
	JLabel leaveDeclined = new JLabel("Leave declined");
	
	
	
	this.setLayout(new GridLayout(8,4,5,10));
	
	if(staff.getLeaveApplyList().size() != 0) {
		
		LeaveApp leaveApp = staff.leaveApplyList.get(0);
//		JButton acknowledgeBT = new JButton("Acknowledge");
//		this.acknowledgeBT = acknowledgeBT;
		
		if(leaveApp.leaveEndorsed == 1) {

			this.add(successApply);
			this.add(acknowledgeBT);
			

		} else if(leaveApp.leaveEndorsed == 0) {

			this.add(leaveDeclined);
			this.add(acknowledgeBT);

		} else {
			this.add(remindApplying);
		}
		
		
	} else 
	{
	this.add(new JPanel());
	this.add(startDateJL);
	this.add(startDateTF);
	this.add(new JPanel());
	
	this.add(new JPanel());
	this.add(DateFormat1JL);
	this.add(DateFormat2JL);
	this.add(new JPanel());
	
	this.add(new JPanel());
	this.add(endDateJL);
	this.add(endDateTF);
	this.add(new JPanel());
	
	this.add(new JPanel());
	this.add(DateFormat3JL);
	this.add(DateFormat4JL);
	this.add(new JPanel());
	
	for (int i = 0; i < 4*4 ; i++)
	{
		this.add(new JPanel());
	}
	
	}
	
	}

}
