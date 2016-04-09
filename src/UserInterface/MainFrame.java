package UserInterface;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Domain.*;


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
		/*
		HeaderUI header = new HeaderUI(staff);
		this.add(header, BorderLayout.NORTH);
		
		FooterUI footer = new FooterUI();
		this.add(footer, BorderLayout.SOUTH);
		footer.enterBT.setEnabled(false);
		
		ContentUI content = new ContentUI(staff);
		this.add(content, BorderLayout.CENTER);
				*/
		
		ActionListener actListenerBackBT = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				login(staffArray);
			}
		};
		
//		footer.backBT.addActionListener(actListenerBackBT);
		this.loadpage();
	}
	private void loadpage() {

		this.revalidate();
		this.repaint();
		this.setVisible(true);

	}
}
