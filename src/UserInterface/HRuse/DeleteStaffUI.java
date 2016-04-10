package UserInterface.HRuse;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Domain.*;

public class DeleteStaffUI extends JPanel{
//	private String[] registerArray = new String[1000];
//	public JComboBox StaffidList = new JComboBox(registerArray);
	public JComboBox StaffidList;
	public DeleteStaffUI (Staff[] staffArray) {
		int validID = 0;
		String[] registerArray = new String[1000];
		for(int i = 0; i < 1000 ;i++){
			if (staffArray[i].gettitle() != "null") {
				String tmpi = String.valueOf(i);
				registerArray[validID] = tmpi;
				validID++;
			}
		}
		
		StaffidList = new JComboBox(registerArray);
		
		this.setLayout(new GridLayout(8,4,5,10));
		this.add(new JPanel());
		this.add(new JLabel("Select Staff ID:"));
		this.add(StaffidList);
		this.add(new JPanel());
		for (int i = 0; i < 4*7 ; i++)
		{
			this.add(new JPanel());
		}
	}
	

}
