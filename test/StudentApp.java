package test;
import java.util.Scanner;
public class StudentApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] arr = new Student[3];
		
		for(int i=0; i<arr.length; i++) {
			Student student = new Student();
			System.out.println("�̸�: ");
			student.setName(scanner.next());
			System.out.println("����: ");
			student.setKor(scanner.nextInt());
			System.out.println("����: ");
			student.setEng(scanner.nextInt());
			System.out.println("����: ");
			student.setMath(scanner.nextInt());
			student.sum();
			student.avg();
			
				arr[i] = student;
			}

	for (int i=0; i<arr.length; i++) {
		arr[i].printStates();
		}
	}
}