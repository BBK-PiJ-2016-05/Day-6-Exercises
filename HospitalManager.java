public class HospitalManager{
	private Patient firstPatient = null;

	public static void main(String[] args){
		HospitalManager hm = new HospitalManager();
		hm.launch();		
	}

	private void launch() {
		System.out.println(countPatients());
		Patient[] patient = new Patient[10];
		for(int i = 0; i < patient.length; i++) {
			patient[i] = new Patient("Patient" + (i + 1), (i + 1) * 3, "Illness" + i);
			addPatient(patient[i]);
		}
		//printList();

		System.out.println(countPatients());		

		deletePatient("Patient4");
		deletePatient("Patient1");

		//printList();

		System.out.println(countPatients());

	}

	public void addPatient(Patient newPatient) {
		if (firstPatient == null) {
			firstPatient = newPatient;
			return;
		}
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}
		current.setNextPatient(newPatient);
	}

	public boolean deletePatient(String name) {
		if (firstPatient == null) {
			return false;
		}
		if (firstPatient.getName().equals(name)) {
			firstPatient = firstPatient.getNextPatient();
			return true;
		}
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
				current.setNextPatient(current.getNextPatient().getNextPatient());
				return true;
			}
			current = current.getNextPatient();
		}
		return false;
	}

	public void printList() {
		if (firstPatient != null){
			Patient current = firstPatient;
			Patient lastPatient = null;
			do {
				lastPatient = current;
				System.out.println(current.getName());
				System.out.println(current.getAge());
				System.out.println(current.getIllness());
				current = current.getNextPatient();
			} while (lastPatient.getNextPatient() != null);
		}
		
	}
	
	public int countPatients() {
		if (firstPatient == null) {
			return 0;
		} else {
			Patient current = firstPatient;
			int count = 1;		
			while (current.getNextPatient() != null){
				count++;
				current = current.getNextPatient();
			}
			return count;
		}
		
	}
}