package UserInterface.HRuse;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Domain.*;

public class NewStaffUI extends JPanel{
	
	public JTextField nameText = new JTextField("",20);
	public JPasswordField passwordText = new JPasswordField("",20);
	public String[] departmentArray = { "Accounting", "Engineering", "Administration", "Human Resource", "Business Analyst"};
	public JComboBox departmentList = new JComboBox(departmentArray);
	public String[] titleArray = {"Senior manager", "Junior manager", "Assistance", "Clerk","Director"};
	public JComboBox titleList = new JComboBox(titleArray);
	
	
	public NewStaffUI(Staff[] staffArray){
		this.setLayout(new GridLayout(8,4,5,10));
			
		this.add(new JPanel());
		this.add(new JLabel("Name:"));
		this.add(nameText);
		this.add(new JPanel());
		
		this.add(new JPanel());
		this.add(new JLabel("Password:"));
		this.add(passwordText);
		this.add(new JPanel());
		
		this.add(new JPanel());
		this.add(new JLabel("Department:"));
		this.add(departmentList);
		this.add(new JPanel());
		
		this.add(new JPanel());
		this.add(new JLabel("Title:"));
		this.add(titleList);
		this.add(new JPanel());
		
		for (int i = 0; i < 16 ; i++)
		{
			this.add(new JPanel());
		}
	
	}
	

}
