package dummy;

import javax.swing.*;

import Domain.*;

import java.awt.*;
import java.awt.event.*;

public class HRWindow extends JFrame{
	HR HR = new HR();
	
	public HRWindow() {
		super("HR Admin");
		this.setSize(500, 300);
		this.setLocation(100,100);
		
		JPanel aPanel = new JPanel(new BorderLayout());
		
		JPanel centerPanel = new JPanel(new GridLayout(2,1));
		centerPanel.add(new JPanel());
		JButton newStaffButton = new JButton("New a staff");
		centerPanel.add(newStaffButton);
		ActionListener actionListener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
			}
		};
		newStaffButton.addActionListener(actionListener);
		centerPanel.add(new JPanel());
		centerPanel.add(new JPanel());
		centerPanel.add(new JButton("Delete a staff"));
		centerPanel.add(new JPanel());
		
		aPanel.add(centerPanel, BorderLayout.CENTER);
		this.add(aPanel);
		this.setVisible(true);
	}
}
