package Keywords.StaticKeyword;

public class StaticDemo {
    public static void main(String[] args) {
        Student.setCollegeName("XYZ");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.getStudentInfo();
        s2.getStudentInfo();
    }
}

class Student {
    String name;
    int rollNo;

    static String collegeName;
    // static counter to set unique roll no
    static int counter = 0;

    public Student(String name) {
        this.name = name;
        this.rollNo = setRollNo();
    }

    // getting unique rollNo through static variable(counter)
    static int setRollNo() {
        return counter++;
    }

    static void setCollegeName(String name) {
        collegeName = name;
    }

    void getStudentInfo() {
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);

        // accessing static variable
        System.out.println("collegeName : " + collegeName);
    }
}