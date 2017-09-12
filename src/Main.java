import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// You may test that your code works find here
		// Please check that your code works and has no
		// compilation problems before to submit

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();

		Student[] st = { s1, s2, s3, s4, s5 };

		StudentGroup sg = new StudentGroup(st);

		sg.remove(1);
		;

	}

}
