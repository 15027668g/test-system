package UserInterface.HRuse;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import Domain.Staff;


public class AssignSupervisorUI extends JPanel{
	public JComboBox StaffIdList;
	public JComboBox SupervisorIdList;
	
	public AssignSupervisorUI (Staff[] staffArray) {
		int validID = 0;
		String[] registerArray = new String[1000];
		for(int i = 0; i < 1000 ;i++){
			if (staffArray[i].gettitle() != "null") {
				String tmpi = String.valueOf(i);
				registerArray[validID] = tmpi;
				validID++;
			}
		}
		
		StaffIdList = new JComboBox(registerArray);
		SupervisorIdList = new JComboBox(registerArray);
		
		
		this.setLayout(new GridLayout(8,4,5,10));
		this.add(new JPanel());
		this.add(new JLabel("Select Staff ID:"));
		this.add(StaffIdList);
		this.add(new JPanel());
		
		this.add(new JPanel());
		this.add(new JLabel("Select Supervisor ID:"));
		this.add(SupervisorIdList);
		this.add(new JPanel());
		
		for (int i = 0; i < 4*6 ; i++)
		{
			this.add(new JPanel());
		}
		
	}
	

}
