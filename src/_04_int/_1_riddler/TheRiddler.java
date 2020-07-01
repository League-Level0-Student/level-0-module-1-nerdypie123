package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What gets wetter the more it dries?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equalsIgnoreCase("towel")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}

		// 5. Otherwise, say "wrong" and tell them the answer
	else {
		JOptionPane.showMessageDialog(null, "Wrong!!!");
	}
String answer2 = JOptionPane.showInputDialog("What travels all around the world while staying in a corner??");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer2.equalsIgnoreCase("stamp")) {
JOptionPane.showMessageDialog(null, "Correct!");
score += 1;
}

// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Wrong!!!");
}
String answer3 = JOptionPane.showInputDialog("What has many keys but can't open any lock?");
//4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer3.equalsIgnoreCase("piano")) {
JOptionPane.showMessageDialog(null, "Correct!");
score += 1;
}

//5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Wrong!");
// 6. Add some more riddles
}
JOptionPane.showMessageDialog(null, "You earned " + score + "/3 points!");
		// 2. Make a pop up to show the score.
		
	}
	}

