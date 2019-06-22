package _05_vault;

public class vault {
	private int code=0;
	vault(int code){
		this.code=code;
		
	}
	
	boolean tryCode(int guess)
	{
		
		if(guess==code)
		{
			return(true);
		}
		else
			return(false);
		
	}
}


