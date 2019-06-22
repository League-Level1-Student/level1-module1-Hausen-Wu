package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BinConv implements ActionListener 
{
	
	JFrame frame=new JFrame("Convert 8 bit to ASCII");
	JPanel panel=new JPanel();
	
	JButton button=new JButton("convert");
	
	JTextField answer = new JTextField(20);
	

	public void run()
	{
		
		frame.add(panel);
		frame.setVisible(true);
		panel.add(answer);
		panel.add(button);
		frame.pack();
		button.addActionListener(this);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		JOptionPane.showMessageDialog(null, convert(answer.getText()));
		
	}
	
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
}
