import java.util.Scanner;

public class StudentApplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----Menu----");
		System.out.println("1. to create a Student object");
		System.out.println("2. to display the student info");
		Student student1 = new Student();
		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1:
			System.out.println("Do you want to add student name (Yes or yes): ");
			String c;
			c = sc.nextLine();
			String name = null;
			if (c.equals("Yes") || c.equals("yes")) {
				System.out.println("Enter student name: ");
				name = sc.nextLine();
			}

			System.out.println("Do you want to add student ID (Yes or yes): ");
			c = sc.nextLine();
			double id = 0;
			if (c.equals("Yes") || c.equals("yes")) {
				System.out.println("Enter student ID: ");
				id = sc.nextDouble();
			}
			sc.nextLine();
			System.out.println("Do you want to add student grade (Yes or yes): ");
			c = sc.nextLine();
			String grade = null;
			if (c.equals("Yes") || c.equals("yes")) {
				System.out.println("Enter student grade: ");
				grade = sc.nextLine();
			}

			if (name != null && id != 0 && grade != null) {
				Student student = new Student(name, grade, id);
				student.display();
			} else if (name != null && id != 0) {
				Student student = new Student(name, id);
				student.display();
			} else if (id != 0) {
				Student student = new Student(id);
				student.display();
			} else {
				Student student = new Student();
				student.display();
			}
			break;
		case 2:
			student1.display();
			break;
		}
		sc.close();
	}
}
