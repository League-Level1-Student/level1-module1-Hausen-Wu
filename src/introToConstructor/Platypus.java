package introToConstructor;

public class Platypus {

	public static void main(String[] args) {}
		private String platypusName;
				
	    public Platypus(String platypusName)
	    {
	    	
	    	this.platypusName=platypusName;
	    	
	    }
	    
	/*	public void setName(String name)
		{
			
			platypusName=name;
			
		}
	*/
	    public String getName()
	    {
	    	return platypusName;
	    }
	    
	    
	    void sayHi()
	    {
	        System.out.println("The platypus " + getName() + " is smarter than your average platypus.");
	    }
	

}
