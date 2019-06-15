package _07_binary_converter;
import javax.swing.*;
public class BinConverter {
	public static void main(String[] args) 
	{
		
		JFrame frame=new JFrame("Convert 8 bit to ASCII");
		JPanel panel=new JPanel();
		JButton button=new JButton("convert");
		JTextField answer = new JTextField(20);
		frame.setVisible(true);
		panel.add(answer);
		panel.add(button);
		frame.add(panel);
		frame.pack();
		button.addActionListener(this);
		
	}
}
