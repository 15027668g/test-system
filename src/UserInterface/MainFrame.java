package UserInterface;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Domain.*;
import UserInterface.HRuse.*;
import UserInterface.Staff.*;



public class MainFrame extends JFrame{
	public MainFrame(Staff[] staff){
		super("Leave application system");
		this.setSize(550,550);
		this.setLocation(100,100);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		login(staff);
//		System.out.print(staff[1].getName());
	}
// Login in page***************************************
	private void login(Staff[] staff){
		this.getContentPane().removeAll();
		
		LoginWindowUI LoginWindow = new LoginWindowUI();
		this.add(LoginWindow, BorderLayout.NORTH);
		
		FooterUI footer = new FooterUI();
		this.add(footer, BorderLayout.SOUTH);
		footer.backBT.setEnabled(false);
		
		ActionListener actListenerEnterBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
			int id = Integer.parseInt(LoginWindow.id.getText());
			String password = new String(LoginWindow.password.getText());

			for (int i = 0; i < 1000; i++){
				if (id == staff[i].getid() && password.equals(staff[i].getpassword())) {
					contentpage(staff, staff[i]); 
//					System.out.print("OK");
					break;
				}else if (i == 999) {

				// invalid login
				JOptionPane.showMessageDialog(LoginWindow, "Staff ID or Password is invalid.");
				}
			}
					
		}
	};
	footer.enterBT.addActionListener(actListenerEnterBT);
	this.loadpage();
}

// content page***************************************
	private void contentpage(Staff[] staffArray, Staff staff){
		this.getContentPane().removeAll();
		
		HeaderUI header = new HeaderUI(staff);
		this.add(header, BorderLayout.NORTH);
		
		FooterUI footer = new FooterUI();
		this.add(footer, BorderLayout.SOUTH);
		footer.enterBT.setEnabled(false);
		
		ContentUI content = new ContentUI(staff);
		this.add(content, BorderLayout.CENTER);
		if (staff.gettitle() == "Director"){
			content.requestLeaveBT.setEnabled(false);
		}
		
		
		ActionListener actListenerNewStaffBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				newStaff(staffArray, staff);
			}
		};
		
		ActionListener actListenerDeleteStaffBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				deleteStaff(staffArray, staff);
			}
		};
		
		ActionListener actListenerAssignSupervisorBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				assignSupervisor(staffArray, staff);
			}
		};
		
		ActionListener actListenerLeaveAppBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				requestLeave(staffArray, staff);
			}
		};
		
		ActionListener actListenerRequestHandleBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				handleLeave(staffArray, staff);
			}
		};
		
		
		ActionListener actListenerBackBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				login(staffArray);
			}
		};
		
		content.newStaffBT.addActionListener(actListenerNewStaffBT);
		content.deleteStaffBT.addActionListener(actListenerDeleteStaffBT);
		content.assignSupervisorBT.addActionListener(actListenerAssignSupervisorBT);
		content.requestLeaveBT.addActionListener(actListenerLeaveAppBT);
		content.requestHandleBT.addActionListener(actListenerRequestHandleBT);
		footer.backBT.addActionListener(actListenerBackBT);
		this.loadpage();
	}

	// New staff  page***************************************
	private void newStaff(Staff[] staffArray, Staff staff){
		this.getContentPane().removeAll();
		
		HeaderUI header = new HeaderUI(staff);
		this.add(header, BorderLayout.NORTH);
		
		FooterUI footer = new FooterUI();
		this.add(footer, BorderLayout.SOUTH);
		
		NewStaffUI newStaff = new NewStaffUI(staffArray);
		this.add(newStaff, BorderLayout.CENTER);
		
		
		ActionListener actListenerEnterBT = new ActionListener(){			
			public void actionPerformed(ActionEvent e){
				
				for(int i = 0; i < staffArray.length; i++ ) {
					if (staffArray[i].getName() == "null"){
						staffArray[i].setid(i);
						staffArray[i].setName(newStaff.nameText.getText());
						staffArray[i].setpassword(newStaff.passwordText.getText());
						staffArray[i].settitle(newStaff.titleList.getSelectedItem().toString());
						staffArray[i].setdepartment(newStaff.departmentList.getSelectedItem().toString());
						String confirmMessage = "Staff ID: " + staffArray[i].getid()+ "\n"+
								"Staff Name: " + staffArray[i].getName()+ "\n"+
								"Staff Title: " + staffArray[i].gettitle()+ "\n"+
								"Staff department: "+ staffArray[i].getdepartment();
						JOptionPane.showMessageDialog(newStaff, confirmMessage);
						break;
					}
				}
				
//				contentpage(staffArray, staff);
			}
		};
		
		ActionListener actListenerBackBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contentpage(staffArray, staff);
			}
		};

		footer.enterBT.addActionListener(actListenerEnterBT);
		footer.backBT.addActionListener(actListenerBackBT);
		this.loadpage();		
	}
	
	// Delete staff  page***************************************	
	private void deleteStaff(Staff[] staffArray, Staff staff){
		this.getContentPane().removeAll();
		
		HeaderUI header = new HeaderUI(staff);
		this.add(header, BorderLayout.NORTH);
		
		FooterUI footer = new FooterUI();
		this.add(footer, BorderLayout.SOUTH);
		
		DeleteStaffUI deleteStaff = new DeleteStaffUI(staffArray);
		this.add(deleteStaff, BorderLayout.CENTER);
		
		
		ActionListener actListenerEnterBT = new ActionListener(){			
			public void actionPerformed(ActionEvent e){
				String Staffid = deleteStaff.StaffidList.getSelectedItem().toString();
				int intStaffid = Integer.parseInt(Staffid);
				staffArray[intStaffid].setName("null");
				staffArray[intStaffid].setpassword("null");
				staffArray[intStaffid].setdepartment("null");
				staffArray[intStaffid].settitle("null"); 
				String message = "Staff ID " + Staffid + " is deleted";
				JOptionPane.showMessageDialog(deleteStaff, message);
				contentpage(staffArray, staff);
					}
				};
				
//				contentpage(staffArray, staff);

		
		ActionListener actListenerBackBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contentpage(staffArray, staff);
			}
		};

		footer.enterBT.addActionListener(actListenerEnterBT);
		footer.backBT.addActionListener(actListenerBackBT);
		this.loadpage();		
	}
	// Assign Supervisor  page***************************************	
	private void assignSupervisor(Staff[] staffArray, Staff staff){
		this.getContentPane().removeAll();
		
		HeaderUI header = new HeaderUI(staff);
		this.add(header, BorderLayout.NORTH);
		
		FooterUI footer = new FooterUI();
		this.add(footer, BorderLayout.SOUTH);
		
		AssignSupervisorUI assignSupervisor = new AssignSupervisorUI(staffArray);
		this.add(assignSupervisor, BorderLayout.CENTER);
		
		
		ActionListener actListenerEnterBT = new ActionListener(){			
			public void actionPerformed(ActionEvent e){
				
				String message;
				String Staffid = assignSupervisor.StaffIdList.getSelectedItem().toString();
				String Supervisorid = assignSupervisor.SupervisorIdList.getSelectedItem().toString();
				int intStaffid = Integer.parseInt(Staffid);
//				int intSupervisorid = Integer.parseInt(Supervisorid);
				if (staffArray[intStaffid].gettitle() != "Director") {
					staffArray[intStaffid].setsupervisorID(Supervisorid);
					message = "Staff ID " + Staffid + " is assigned a supervisor ID " + Supervisorid;
					contentpage(staffArray, staff);
				} else {
					message = "No Supervisor assigned for Director";
				}
				JOptionPane.showMessageDialog(assignSupervisor, message);
					}
				};
				
//				contentpage(staffArray, staff);

		
		ActionListener actListenerBackBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contentpage(staffArray, staff);
			}
		};
		
		footer.enterBT.addActionListener(actListenerEnterBT);
		footer.backBT.addActionListener(actListenerBackBT);
		this.loadpage();		
	}
	
	// Apply Leave page***************************************
	private void requestLeave(Staff[] staffArray, Staff staff){
		this.getContentPane().removeAll();
		
		HeaderUI header = new HeaderUI(staff);
		this.add(header, BorderLayout.NORTH);
		
		FooterUI footer = new FooterUI();
		this.add(footer, BorderLayout.SOUTH);
		if (staff.leaveApplyList.size() != 0){
			footer.enterBT.setEnabled(false);
		}
		
		requestLeaveUI requestLeave = new requestLeaveUI(staff);
		this.add(requestLeave, BorderLayout.CENTER);
		
		
		ActionListener actListenerEnterBT = new ActionListener(){			
			public void actionPerformed(ActionEvent e){
				String startDate = requestLeave.startDateTF.getText();
				String endDate = requestLeave.endDateTF.getText();
				LeaveApp leaveApp = new LeaveApp(startDate, endDate, staff.getid());
				staff.leaveApplyList.add(leaveApp);
				
				String staffSupervisorID = staff.getsupervisorID();
				int intStaffSupervisorID = Integer.parseInt(staffSupervisorID);
				staffArray[intStaffSupervisorID].addHandleApply(leaveApp);    //add request to handle list
				
				String message = "Leave Applied:\nStartDate: " + startDate + "\nEndDate: " + endDate;
				JOptionPane.showMessageDialog(requestLeave, message);
				
				contentpage(staffArray, staff);
				}
		};
		
		ActionListener actListenerAcknowledgeBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				staff.leaveApplyList.remove(0);
				contentpage(staffArray, staff);
			}
		};
						
		ActionListener actListenerBackBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contentpage(staffArray, staff);
			}
		};

		footer.enterBT.addActionListener(actListenerEnterBT);
		requestLeave.acknowledgeBT.addActionListener(actListenerAcknowledgeBT);
		footer.backBT.addActionListener(actListenerBackBT);
		this.loadpage();		
	}
	
	// handle leave  page***************************************
	private void handleLeave(Staff[] staffArray, Staff staff){
		this.getContentPane().removeAll();
		
		HeaderUI header = new HeaderUI(staff);
		this.add(header, BorderLayout.NORTH);
		
		FooterUI footer = new FooterUI();
		this.add(footer, BorderLayout.SOUTH);
		
		handleLeaveUI handleLeave = new handleLeaveUI(staffArray, staff);
		this.add(handleLeave, BorderLayout.CENTER);
		
		
		ActionListener actListenerEnterBT = new ActionListener(){			
			public void actionPerformed(ActionEvent e){
				// chain of responsibility
				LeaveApp LeaveApp = staff.getHandleApplyList().get(0);
				String message;
				Staff applicant = staffArray[LeaveApp.getStaffid()];
				LeaveApp applicantLeaveapp0 = applicant.getLeaveApplyList().get(0);
				if(handleLeave.endorseJRB.isSelected()){
					String supervisorID = staff.getsupervisorID();
					if(supervisorID != null){
						int intSupervisorID = Integer.parseInt(supervisorID);
						staffArray[intSupervisorID].addHandleApply(LeaveApp);
						message = "Leave Endorsed. Passed the endorsement to your supervisor.";
					} else {
						applicantLeaveapp0.leaveEndorsed = 1;
						message = "Leave Endorsed. Staff apply leave successfully";
					}
				} else {
					applicantLeaveapp0.leaveEndorsed = 0;
					message = "Leave Declined. System will remind the applicant.";
				}
				JOptionPane.showMessageDialog(handleLeave, message);
				staff.removeHandleApply(LeaveApp);
				contentpage(staffArray, staff);
				}
		};
						
		ActionListener actListenerBackBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contentpage(staffArray, staff);
			}
		};

		footer.enterBT.addActionListener(actListenerEnterBT);
		footer.backBT.addActionListener(actListenerBackBT);
		this.loadpage();		
	}
	
	private void loadpage() {

		this.revalidate();
		this.repaint();
		this.setVisible(true);

	}
}
