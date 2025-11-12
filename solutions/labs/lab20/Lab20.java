import java.util.*;

public class Lab20 {
	public static void main(String[] args) {
		View type;
		if (args.length != 0 && args[0].equals("--dialog")) {
			type = new DialogView();
		}
		else {
			type = new ConsoleView();
		}
		
		Course c = new Course();
		StudentView v = new StudentView(type);

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