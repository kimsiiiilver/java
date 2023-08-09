package sec01;

import java.util.*;

public class StudentArrayList {

	public static void main(String[] args) {

		Student[] student = new Student[4];
		List<Student> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ���� ����� �Է��ϼ���.");
		for (int i = 0; i < student.length; i++) {
			System.out.println(">>");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			list.add(student[i]); // ArrayList�� �л� ���� ����
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("-----------------------------------");
			Student stu = list.get(i);
			System.out.println("�̸� : " + stu.getName());
			System.out.println("�а� : " + stu.getDepartment());
			System.out.println("�й� : " + stu.getNumber());
			System.out.println("������� : " + stu.getGrade());
			System.out.println("-----------------------------------");
		}

		while (true) {
			System.out.println("�л� �̸� >>");
			String name = s.next();
			if (name.equals("�׸�")) {
				break;
			} else {
				System.out.println("�̸��� �ٽ� �Է��� �ּ���.");
			}

			for (int i = 0; i < list.size(); i++) {
				Student stu = list.get(i);
				stu.find_student(name);
			}
		}

	}

}
