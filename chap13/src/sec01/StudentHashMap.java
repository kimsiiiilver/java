package sec01;

import java.util.*;

public class StudentHashMap {

	public static void main(String[] args) {

		Student[] student = new Student[4];
		Map<String, Student> map = new HashMap<>();

		Scanner s = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ���� ����� �Է��ϼ���.");
		for (int i = 0; i < student.length; i++) {
			System.out.println(">>");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			map.put(name, student[i]); // HashMap�� �л� ���� ����
		}

		Set<String> key = map.keySet();
		Iterator<String> iterator = key.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println("-------------------------------------");
			Student stu = map.get(name);
			System.out.println("�̸� : " + stu.getName());
			System.out.println("�а� : " + stu.getDepartment());
			System.out.println("�й� : " + stu.getNumber());
			System.out.println("������� : " + stu.getGrade());
			System.out.println("-------------------------------------");
		}

		while (true) {
			System.out.println("�л� �̸� >>");
			String name = s.next();
			if (name.equals("�׸�")) {
				break;
			}
			Student stu = map.get(name);
			stu.find_student(name);

		}

	}

}
