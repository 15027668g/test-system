package Domain;

import UserInterface.*;
import UserInterface.HRuse.*;

public class SYSmain {
	public static void main (String[] args) {
//		new LoginWindow();
//		new HRWindow();
//		new AddStaffUI();
		HR HR = new HR();
//		final Staff staff1 = new Staff(1, "1234", "admin", "HR", "admin");
		new MainFrame(HR.getstaffArray());
	}
}


