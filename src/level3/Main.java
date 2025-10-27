package level3;

import level3.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Laura", 21, "Java", 1));
        students.add(new Student("Miguel", 24, "PHP", 2));
        students.add(new Student("Sofía", 56, "Java", 3));
        students.add(new Student("Daniel", 13, "PHP", 4));
        students.add(new Student("Carmen", 16, "PHP", 5));
        students.add(new Student("Javier", 43, "Java", 6));
        students.add(new Student("Paula", 2, "Java", 7));
        students.add(new Student("Andrés", 17, "Java", 8));
        students.add(new Student("Lucía", 18, "PHP", 9));
        students.add(new Student("Marcos", 900, "Java", 10));

        students.forEach(student -> System.out.println("Name: " + student.getName() + " Age: " + student.getAge()));

        List<Student> studentsContainsA = students.stream()
                .filter(student -> student.getName().charAt(0) == 'A')
                .toList();

        studentsContainsA.forEach(student -> System.out.println(student.getName()));

        students.stream()
                .filter(student -> student.getGrade() >= 5)
                .forEach(System.out::println);

        students.stream()
                .filter(student -> student.getGrade() >= 5)
                .filter(student -> !student.getCourse().equals("PHP"))
                .forEach(System.out::println);

        students.stream()
                .filter(student -> student.getCourse().equals("Java"))
                .filter(student -> student.getAge() >= 18)
                .forEach(System.out::println);
    }
}