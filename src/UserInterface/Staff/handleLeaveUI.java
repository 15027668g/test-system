package UserInterface.Staff;

import java.awt.GridLayout;
import javax.swing.*;
import Domain.*;


public class handleLeaveUI extends JPanel{
	public JRadioButton endorseJRB = new JRadioButton();
	public JRadioButton declineJRB = new JRadioButton();
	
	public handleLeaveUI(Staff[] staffArray, Staff staff){
		ButtonGroup groupJRB = new ButtonGroup();
		groupJRB.add(endorseJRB);
		groupJRB.add(declineJRB);
		
		int HandleApplyListSize = staff.getHandleApplyList().size();
		if (HandleApplyListSize > 0 )
		{
		LeaveApp leaveHandleListRecord0 = staff.getHandleApplyList().get(0);
		String startDate0 = leaveHandleListRecord0.startDate;
		String endDate0 = leaveHandleListRecord0.endDate;
		int applicantid0 = leaveHandleListRecord0.applicantid;
		
		JLabel applicantidJL = new JLabel("Staff ID: " + applicantid0);
		JLabel startDateJL = new JLabel("Start Date: " + startDate0);
		JLabel endDateJL = new JLabel("end Date: " + endDate0);
				
		this.setLayout(new GridLayout(8,4,5,10));
		
		this.add(new JPanel());
		this.add(applicantidJL);
		this.add(new JPanel());
		this.add(new JPanel());
		
		this.add(new JPanel());
		this.add(startDateJL);
		this.add(new JPanel());
		this.add(new JPanel());
		
		this.add(new JPanel());
		this.add(endDateJL);
		this.add(new JPanel());
		this.add(new JPanel());
		
		this.add(new JLabel("Endorse: "));
		this.add(endorseJRB);
		this.add(new JLabel("Decline: "));
		this.add(declineJRB);
		
		for (int i = 0; i < 4*4 ; i++)
		{
			this.add(new JPanel());
		}
		
		
		endorseJRB.setSelected(true);
		}
		else
		{
			this.setLayout(new GridLayout(8,4,5,10));
			JLabel NoApplyJL = new JLabel("No Apply");
			this.add(NoApplyJL);
			
		}
	}
}
