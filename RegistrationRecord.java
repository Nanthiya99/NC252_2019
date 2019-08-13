import javax.security.auth.Subject;


public class RegistrationRecord {
	private Student student;
	private Subject [] subjects;
	private int count;
	
	public RegistrationRecord() {
		student = new Student();
		subjects = new Subject[10];
		for(int i=0 ; i < 10 ; i++){
			subjects[1] = new Subject();
			
		}
	}
	public RegistrationRecord(int n) {
	count = 0;
	student = new Student();
	subjects = new Subject[n];
	for(int i=0 ; i < n ; i++){
		subjects[1] = new Subject();
	}	
  }
	public void addsubject(Subject s) {
		if(count < subjects.length - 1){
			subjects[count] = s;
			count++;
	}
 }
	public void displsy(){
		for(int i = 0 ; i < count; i++){
			System.out.println(subject[i]);
		}
	}
}