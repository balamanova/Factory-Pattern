
public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IITU it  = new IITU();
		it.createChoice("IS");
		
		KBTU kbtu  = new KBTU();
		kbtu.createChoice("Finance");
	}

}
