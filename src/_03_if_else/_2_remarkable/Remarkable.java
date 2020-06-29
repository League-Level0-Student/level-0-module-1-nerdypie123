package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.

	String Ben = "He is good at singing and flying on peaches";
	String Evan = "He is a good programmer";
	String Bryce = "He is handsome and charming \nand toatally in my unbias opinion the best";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Name to remark?");
if (name.equalsIgnoreCase(Bryce)) {
JOptionPane.showMessageDialog(null, Bryce);	
}
else if(name.equalsIgnoreCase(Evan)) {
JOptionPane.showMessageDialog(null, Evan);
}
if (name.equalsIgnoreCase(Ben)) {
JOptionPane.showMessageDialog(null, Ben);	
}
}
		// 3. In a pop-up, tell the user what is remarkable about that person. 

;	}


