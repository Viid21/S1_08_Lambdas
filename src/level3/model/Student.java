package level3.model;

public class Student {
    String name;
    int age;
    String course;
    int grade;

    public Student(String name, int age, String course, int grade) {
        this.age = age;
        this.course = course;
        this.grade = grade;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}
