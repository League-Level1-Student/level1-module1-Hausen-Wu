package _05_vault;

import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		int sc=Integer.valueOf(JOptionPane.showInputDialog(null,"input 7 digit password"));
		JamesBond jb=new JamesBond();
		Vault vt= new Vault(sc);
		jb.findCode(vt);
		jb.openVult(vt);
	}

	
	
}
