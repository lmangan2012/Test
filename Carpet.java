//Carpet.java
/*This program will calculate the cost of carpeting a room wall to wall. The user should be 
 *asked for his/her name, the length of the room, breadth of the room and cost per square metre of the carpet, 
 *each to be entered via an input dialog. The program should then generate a quotation for the 
 *customer containing information in the following format. Suggestion: send the output initially
 * to System.out: when you have that working, transfer it to a JTextArea within a message dialog.
 * You will need to set the Font of the JTextArea to a monospaced font.*/
 
 import javax.swing.JOptionPane;
 import javax.swing.JTextArea;
 import java.awt.*;
 
 
 public class Carpet{
 	public static void main(String args[])
 	{
 		
 		String name;
 		double roomLength,roomBreadth,costPerSquareMetre;
 		
 		
 		name = JOptionPane.showInputDialog("Please enter your name: ");
 		
 		roomLength = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the room: "));
 		
 		roomBreadth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the breadth of the room: "));
 		
 		costPerSquareMetre = Double.parseDouble(JOptionPane.showInputDialog("Please enter the cost per square metre of the carpet: "));
 		
 		
 		JTextArea textArea = new JTextArea(10,30);
 		
 		Font monoFont = new Font("Courier",Font.PLAIN,14);
 		
 		output.setFont(monoFont);
 		
 		String message = String.format(%-20s%.2f m.\n %-20s%.2f m.\n"
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 	}	
 }
 
 