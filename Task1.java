class Student {
    int ID;
    String name;
    static int totalNum;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
        Student.totalNum++;
    }
    public static void total() {
        System.out.println("The total number of Students: " + totalNum);
    }
    public void display() {
        System.out.println("Student ID: " + ID + "\nStudent Name: " + name);
    }
}

public class Task1 {
    public static void main (String[] args) {

        Student s1 = new Student(123,"Asad");
        Student s2 = new Student(456,"Yusra");
        Student s3 = new Student(789,"Ayan");

        s1.display();
        s2.display();
        s3.display();
        Student.total();
    }
}