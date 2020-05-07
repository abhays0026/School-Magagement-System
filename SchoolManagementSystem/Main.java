package SchoolManagementSystem;

import java.util.ArrayList;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Teacher lizzyTeacher = new Teacher(1, "Lizzy", 500);
		Teacher mellisaTeacher = new Teacher(2, "mellisa", 700);
		Teacher vanderhornTeacher = new Teacher(3, "VanderHorn", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzyTeacher);
		teacherList.add(mellisaTeacher);
		teacherList.add(vanderhornTeacher);
		
		Student tamakaStudent = new Student(1, "Tamaka", 4);
		Student rakshitStudent = new Student(2, "Rakshit", 12);
		Student rabbiStudent = new Student(3, "Rabbi", 5);
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(tamakaStudent);
		studentList.add(rakshitStudent);
		studentList.add(rabbiStudent);
		
		School gghSchool = new School(teacherList, studentList);
		
		
		tamakaStudent.payFees(5000);
		rakshitStudent.payFees(6000);
		System.out.println("GGHS has earned" + gghSchool.getTotalMoneyEarned());

		
		System.out.println("------- GGHS paying the teachers--------");
		lizzyTeacher.recieveSalary(lizzyTeacher.getSalary());
		System.out.println("GGHS has spent for salary to " + lizzyTeacher.getName()
		+ " and now has : " + gghSchool.getTotalMoneyEarned());
		
		
	}

}
