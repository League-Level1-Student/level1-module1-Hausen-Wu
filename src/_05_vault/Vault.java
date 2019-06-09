package _05_vault;



class JamesBond
{
	public int code=99999;
	JamesBond()
	{
		System.out.println("James Bond created.");
	}
	int findCode(Vault a)
	{
		System.out.println("start cracking");
		while(code!=a.getCode())
		{
			code+=1;
			System.out.println("Testing Code "+code);
			if(code==a.getCode()||code>9999999)
			{
				
				break;
				
			}
			
		}
		
		if(code==a.getCode())
		{
			return(code);
		}
		
		if(code==-1)
			return(-1);
		
		else
			throw new IllegalArgumentException("no password found or out of range");
	}
	
	void openVult(Vault a)
	{
		if(a.tryCode(findCode(a))==true)
		{
			System.out.println(a.tryCode(findCode(a)));
			System.out.println(findCode(a)+" is the password");
		}
		if(findCode(a)==-1)
		{
			throw new IllegalArgumentException("no password found or out of range");
			
		}
	
	}
	
	
}

public class Vault 
{
	
	private int secretCode;
	public Vault(int secretCode)
	{
		
		if(secretCode<=99999)
		{
			throw new IllegalArgumentException("TThe password is too short");
		}
		
		this.secretCode=secretCode;
		
	}
	
	public int getCode()
	{
		return(this.secretCode);
	}
	
	public boolean tryCode(int a)
	{
		if(a==this.secretCode)
		{
			return(true);
		}
		
		else
			return(false);
	}
	
	
}

