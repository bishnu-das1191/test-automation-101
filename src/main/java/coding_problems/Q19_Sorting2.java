package coding_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q19_Sorting2 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bishop",2,90));
        students.add(new Student("Chaitali",3,78));
        students.add(new Student("Aman",1,85));
        students.add(new Student("Deven",4,92));

        System.out.println("Before Sorting");
        System.out.println(students);

        //Sort by names (ASC)
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Sorted by Names (ASC) : "+students);

        //Sort by names (DESC)
        Collections.sort(students, Comparator.comparing(Student::getName).reversed());
        System.out.println("Sorted by Names (DESC) : "+students);

        //Sort the Student by their marks
        Collections.sort(students,Comparator.comparing(Student::getMarks).reversed());
        System.out.println("Sorted by Marks (DESC)" + students);

        //Sort the Student by their roll numbers
        Collections.sort(students,Comparator.comparing(Student::getRollNum));
        System.out.println("Sorted by Roll No. (ASC)" + students);



    }
}

class Student {

    private String name;
    private int rollNum;
    private int marks;

    public Student(String name, int rollNum, int marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", marks=" + marks +
                '}';
    }
}