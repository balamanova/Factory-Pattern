
public abstract class SelectUniversity {
	public Majors createChoice(String major){
		Majors selectedMajor;
		selectedMajor = selectMajor(major);
		selectedMajor.passExam();
		selectedMajor.studySubject();
		return selectedMajor;
	}
	abstract Majors selectMajor(String major);
}
