

public class Examples {

	public static void main(String[] args) {
		//Create a Student object
		Student s = new Student();
		//Set the grade and gpa
		s.setGpa(3.9);
		s.setSchedule("Band, Computer Science, Art");
		//Set the inherited name and birthday
		s.setName("Molly");
		s.setBirthday("September 15, 2010");
		
		System.out.println(s.getName() + " takes " + s.getSchedule());
	}

}
