
public class IITU extends SelectUniversity {

	@Override
	public Majors selectMajor(String major) {
		// TODO Auto-generated method stub
		if(major.equals("IS")){
			return new IituIS();
		}
		else if(major.equals("Journalism")){
			return new IituJur();
		}
		else return null;
	}

}
