package UserInterface;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Domain.*;
import UserInterface.HRuse.*;



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
					contentpage(staff, staff[i]); // go to content panel
//					System.out.print("OK");
					break;
				}else if (i == 999) {

				// invalid authentication
				JOptionPane.showMessageDialog(LoginWindow, "Staff ID or Password is invalid.");
				}
			}
					
		}
	};
	footer.enterBT.addActionListener(actListenerEnterBT);
	this.loadpage();
}


	
	private void contentpage(Staff[] staffArray, Staff staff){
		this.getContentPane().removeAll();
		
		HeaderUI header = new HeaderUI(staff);
		this.add(header, BorderLayout.NORTH);
		
		FooterUI footer = new FooterUI();
		this.add(footer, BorderLayout.SOUTH);
		footer.enterBT.setEnabled(false);
		
		ContentUI content = new ContentUI(staff);
		this.add(content, BorderLayout.CENTER);
		
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
		
		
		ActionListener actListenerBackBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				login(staffArray);
			}
		};
		
		content.newStaffBT.addActionListener(actListenerNewStaffBT);
		content.deleteStaffBT.addActionListener(actListenerDeleteStaffBT);
		content.assignSupervisorBT.addActionListener(actListenerAssignSupervisorBT);
		footer.backBT.addActionListener(actListenerBackBT);
		this.loadpage();
	}
	
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
	
	
	
	
	private void loadpage() {

		this.revalidate();
		this.repaint();
		this.setVisible(true);

	}
}
