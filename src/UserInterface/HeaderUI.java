package UserInterface;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Domain.Staff;

public class HeaderUI extends JPanel {

	
	public HeaderUI(Staff staff) {
		
			
			this.setLayout(new GridLayout(5, 1));
			
			int id = staff.getid();
			String name = staff.getName();
			String title = staff.gettitle();
			
			JPanel topPanel = new JPanel();
			topPanel.add(new JLabel("Leave application System"));
			this.add(topPanel, BorderLayout.NORTH);
			
			JLabel headerid = new JLabel("Staff ID: " + id, JLabel.LEFT);
			this.add(headerid);
			
			JLabel headerName = new JLabel("Staff Name: " + name, JLabel.LEFT);
			this.add(headerName);
			
			JLabel headertitle = new JLabel("Staff Title: " + title, JLabel.LEFT);
			this.add(headertitle);
			


		

	}
}
