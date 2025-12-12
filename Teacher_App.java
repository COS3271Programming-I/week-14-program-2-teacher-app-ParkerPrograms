package Week14;

import java.util.Scanner;

class Teacher extends Person {
	String Subject;
	
	public Teacher() {
		System.out.print("Subject Taught: ");
		Subject = userinput.nextLine();
	}
}

public class Teacher_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		int numTeachers;
		int numStudents;
		int numPeople;
		//create array of teachers
		System.out.print("Enter the number of teachers you will enter: ");
		numTeachers = userinput.nextInt();
		Teacher[] teacher = new Teacher[numTeachers];
		for (int i=0; i<numTeachers; i++) {
			teacher[i] = new Teacher();
			System.out.println("Teacher created...\n");
		}
		//create array of students
		System.out.print("Enter the number of students you will enter: ");
		numStudents = userinput.nextInt();
		Student[] student = new Student[numStudents];
		for (int i=0; i<numStudents; i++) {
			student[i] = new Student();
			System.out.println("Student created...\n");
		}
		//create array of people
		System.out.print("Enter the number of other people you will enter: ");
		numPeople = userinput.nextInt();
		Person[] person = new Person[numPeople];
		for (int i=0; i<numPeople; i++) {
			person[i] = new Person();
			System.out.println("Person created...\n");
		}
		//display information in a table format
		System.out.println("Name                Age       Position");
		System.out.println("----------------------------------------");
		//display teachers
		for (int i=0; i<numTeachers; i++) {
			System.out.format("%-20s%-10d%-10s\n", teacher[i].first_name + " " + teacher[i].last_name, teacher[i].age, "Teacher");
		}
		//display students
		for (int i=0; i<numStudents; i++) {
			System.out.format("%-20s%-10d%-10s\n", student[i].first_name + " " + student[i].last_name, student[i].age, "Student");
		}
		//display other people
		for (int i=0; i<numPeople; i++) {
			System.out.format("%-20s%-10d\n", person[i].first_name + " " + person[i].last_name, person[i].age);
		}
	}
}
	