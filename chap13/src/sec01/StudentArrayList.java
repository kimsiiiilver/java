package sec01;

import java.util.*;

public class StudentArrayList {

	public static void main(String[] args) {

		Student[] student = new Student[4];
		List<Student> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
		for (int i = 0; i < student.length; i++) {
			System.out.println(">>");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			list.add(student[i]); // ArrayList에 학생 정보 저장
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("-----------------------------------");
			Student stu = list.get(i);
			System.out.println("이름 : " + stu.getName());
			System.out.println("학과 : " + stu.getDepartment());
			System.out.println("학번 : " + stu.getNumber());
			System.out.println("학점평균 : " + stu.getGrade());
			System.out.println("-----------------------------------");
		}

		while (true) {
			System.out.println("학생 이름 >>");
			String name = s.next();
			if (name.equals("그만")) {
				break;
			} else {
				System.out.println("이름을 다시 입력해 주세요.");
			}

			for (int i = 0; i < list.size(); i++) {
				Student stu = list.get(i);
				stu.find_student(name);
			}
		}

	}

}
