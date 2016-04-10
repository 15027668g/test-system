package UserInterface.Staff;


import java.awt.GridLayout;
import javax.swing.*;
import Domain.Staff;

public class requestLeaveUI  extends JPanel{
	public JTextField startDateTF = new JTextField();
	public JTextField endDateTF = new JTextField();
	
	public requestLeaveUI(){
		
	JLabel startDateJL = new JLabel("Leave Start Date: ");	
	JLabel endDateJL = new JLabel("Leave End Date: ");
	JLabel DateFormat1JL = new JLabel("Start Date Format: ");
	JLabel DateFormat2JL = new JLabel("YYYY/MM/DD");
	JLabel DateFormat3JL = new JLabel("Leave Date Format: ");
	JLabel DateFormat4JL = new JLabel("YYYY/MM/DD");
	
	this.setLayout(new GridLayout(8,4,5,10));
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
