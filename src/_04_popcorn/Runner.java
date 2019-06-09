package _04_popcorn;

import java.util.*;

import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=Integer.valueOf(JOptionPane.showInputDialog(null,"Time to be cooked"));
		
		String flavorP=JOptionPane.showInputDialog(null,"Flavor");
		Popcorn p= new Popcorn(flavorP);
		Microwave m=new Microwave();
		m.putInMicrowave(p);
		m.setTime(time);
		m.startMicrowave();
	}

}
