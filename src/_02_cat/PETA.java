package _02_cat;

public class PETA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat("lorem ipsum");
		cat.meow();
		cat.printName();
		
		for(int i=0;i<9;i++)
			cat.kill();
	}

}
