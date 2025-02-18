package coding_problems;

public class Q19_Sorting2 {
    public static void main(String[] args) {

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