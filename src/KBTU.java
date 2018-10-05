
public class KBTU  extends SelectUniversity {

	@Override
	public Majors selectMajor(String major) {
		// TODO Auto-generated method stub
		if(major.equals("IS")){
			return new KbtuIS();
		}
		else if(major.equals("Finance")){
			return new KbtuFinance();
		}
		else return null;

	}

}
