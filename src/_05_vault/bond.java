package _05_vault;

import javax.swing.JOptionPane;

public class bond {
	int trial=0;
	vault vault=new vault(Integer.valueOf(JOptionPane.showInputDialog(null,"Create an 6 digit numerical password")));
bond()
{	
	
	

}
int findCode()
{

	while(vault.tryCode(trial)==false)
	{
	trial+=1;
	System.out.println("trying "+trial);
	if(vault.tryCode(trial)==true)
	{
		break;
	}
	if(trial>=1000000)
		return(-1);
	}
	
	return(trial);
	
}

}
