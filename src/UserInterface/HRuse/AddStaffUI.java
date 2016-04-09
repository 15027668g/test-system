package UserInterface.HRuse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Domain.*;

public class AddStaffUI extends JFrame {
	public AddStaffUI() {
		super("Staff Account Create");
		this.setSize(500, 300);
		this.setLocation(100,100);
		
		JPanel aPanel = new JPanel(new BorderLayout());
		JPanel topPanel = new JPanel();
		topPanel.add(new JLabel("New staff personal information"));
		aPanel.add(topPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel(new GridLayout(8,4,5,10));
		//1st
		for (int i = 0; i < 4 ; i++)
		{
			centerPanel.add(new JPanel());
		}
		//2nd
		centerPanel.add(new JPanel());
		centerPanel.add(new JLabel("Name:"));
		JTextField nameText = new JTextField("",20);
		centerPanel.add(nameText);
		centerPanel.add(new JPanel());
		//3rd
		centerPanel.add(new JPanel());
		centerPanel.add(new JLabel("Age:"));
		JTextField ageText = new JTextField("",20);
		centerPanel.add(ageText);
		centerPanel.add(new JPanel());
		//4th
		centerPanel.add(new JPanel());
		centerPanel.add(new JLabel("Department:"));
		JTextField departmentText = new JTextField("",20);
		centerPanel.add(departmentText);
		centerPanel.add(new JPanel());
		//5th
		centerPanel.add(new JPanel());
		centerPanel.add(new JLabel("Title:"));
		JTextField titleText = new JTextField("",20);
		centerPanel.add(titleText);
		centerPanel.add(new JPanel());
		//6th
		for (int i = 0; i < 4 ; i++)
		{
			centerPanel.add(new JPanel());
		}
		//7th
		centerPanel.add(new JPanel());
		JButton EnterStaffInfoBT = new JButton("Enter"); 
		centerPanel.add(EnterStaffInfoBT); 
		JButton CancelInfoBT = new JButton("Cancel");
		centerPanel.add(CancelInfoBT);
		centerPanel.add(new JPanel());
		//8th
		for (int i = 0; i < 4 ; i++)
		{
			centerPanel.add(new JPanel());
		}
		//End
		
		aPanel.add(centerPanel, BorderLayout.CENTER);
		this.add(aPanel);
		this.setVisible(true);
		HR HR = new HR();
		ActionListener actListenerEnterBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name = nameText.getText();
				String department = departmentText.getText();
				String title = titleText.getText();
				int ageInt = Integer.parseInt(ageText.getText());
				HR.newStaff(name,department ,title, ageInt);
				/*
				Staff someone = new Staff();
				someone.setName(nameText.getText());
				int ageInt = Integer.parseInt(ageText.getText());
				someone.setage(ageInt);
				someone.setdepartment(departmentText.getText());
				someone.settitle(titleText.getText());
				System.out.println(someone.getName());
				System.out.println(someone.getage());
				System.out.println(someone.getdepartment());
				System.out.println(someone.gettitle()); */
			}
		};
		ActionListener actListenerCancelBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				nameText.setText("");
				ageText.setText("");
				departmentText.setText("");
				titleText.setText("");
			}
		}; 
		
		EnterStaffInfoBT.addActionListener(actListenerEnterBT);
		CancelInfoBT.addActionListener(actListenerCancelBT);
	}

}
