package UserInterface;

import javax.swing.*;
import java.awt.*;

public class LoginWindowUI extends JPanel {
	public JTextField id = new JTextField("",20);
	public JTextField password = new JTextField("",20);
	public LoginWindowUI(){
		
		JPanel aPanel = new JPanel(new BorderLayout());
		JPanel topPanel = new JPanel();
		topPanel.add(new JLabel("Leave application System"));
		aPanel.add(topPanel, BorderLayout.NORTH);
		JPanel centerPanel = new JPanel(new GridLayout(8,3,5,10));
		for (int i = 0; i < 6; i++) {
			centerPanel.add(new JPanel());
		}
		centerPanel.add(new JLabel("Staff ID", SwingConstants.RIGHT));
		centerPanel.add(id);
		centerPanel.add(new JPanel());
		centerPanel.add(new JLabel("Password", SwingConstants.RIGHT));
		centerPanel.add(password);
		centerPanel.add(new JPanel());
		centerPanel.add(new JPanel());
		centerPanel.add(new JPanel());
		centerPanel.add(new JPanel());
		for(int i = 0; i<9; i++) {
			centerPanel.add(new JPanel());
		}
		aPanel.add(centerPanel, BorderLayout.CENTER);
		
		this.add(aPanel);
	}
}
