package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Hilogan {
public static void main(String[] args) {
Random randy= new Random();
int x=randy.nextInt(100)+ 1;

for (int i = 0; i < 101; i++) {	
	String answer=JOptionPane.showInputDialog("Enter a random number");
	int ansAsInt=Integer.parseInt(answer);
	if(ansAsInt> x){
		JOptionPane.showMessageDialog(null, "Try to guess lower");
	}
	if(ansAsInt< x){
		JOptionPane.showMessageDialog(null, "Guess higher");
	}
	if(ansAsInt== x){
		JOptionPane.showMessageDialog(null, "You won great job ");
		i=101;
	}
}
}
}
