import java.util.*;

public class Lab17 {
	public static void main(String[] args) {
		Course c = new Course();
		StudentView v = new StudentView();

		do {
			Student s = v.getStudent();
			if (s != null) {
				c.addStudent(s);
			}
		} while (v.goAgain());
			
		String m = v.getMajor();
		v.printWithMajor(c.getStudentsWithMajor(m), m);
		
		v.printHonorRoll(c.getHonorRoll());
	}
}