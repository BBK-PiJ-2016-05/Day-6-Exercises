public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; // Pointer to another patient!
		this.previousPatient = null;
	}
	public Patient getNextPatient (){
		return this.nextPatient;
	}
	
	public Patient getPreviousPatient(){
		return this.previousPatient;
	}
	
	public String getName(){
		return this.name;
	}
		
	public int getAge(){
		return this.age;
	}

	public String getIllness() {
		return this.illness;
	}

	public void setNextPatient(Patient nextPatient){
		this.nextPatient = nextPatient;
	}

	public void setPreviousPatient(Patient previousPatient){
		this.previousPatient = previousPatient;
	}

	public void setName(String name){
		this.name = name;
	}
		
	public void setAge(int age){
		this.age = age;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

}

