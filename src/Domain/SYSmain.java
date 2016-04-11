package Domain;


import UserInterface.*;


public class SYSmain {
	public static void main (String[] args) {

		HR HR = new HR();
		new MainFrame(HR.getstaffArray());
				
	}
}


