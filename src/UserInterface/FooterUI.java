package UserInterface;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FooterUI extends JPanel {
	
	public JButton enterBT = new JButton("Enter");
	public JButton backBT = new JButton("Back");
	
	public FooterUI() {
		
		this.add(enterBT);
		this.add(backBT);
		
	}

}
