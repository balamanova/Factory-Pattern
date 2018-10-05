import java.util.ArrayList;

public abstract class Majors {
	String subject;
	ArrayList<String> disciplines = new ArrayList<String>();
	
	void passExam(){
		System.out.println("Pass exam " + subject);
	}
	
	void studySubject(){
		System.out.println("At the time of University will study disciplines: ");
		for(int i=0;i<disciplines.size();i++)
		System.out.println("\t" + disciplines.get(i));
	}
}
