package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	
	String date = JOptionPane.showInputDialog("What date is your birthday? mm/dd");
if(date.equals("06/29")) {
	JOptionPane.showMessageDialog(null, "Happy birthday!");
}
else {
JOptionPane.showMessageDialog(null, "Happy unbirthday!");	
}
}
	
}

