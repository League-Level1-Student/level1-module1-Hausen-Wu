package _05_vault;

public class Run {

	public static void main(String[] args) {
		bond bond=new bond();
		System.out.println("the password is "+bond.findCode());
		if(bond.findCode()==-1)
		{
			throw new IllegalArgumentException("Failed, password out of range.");
		}
	}

}
