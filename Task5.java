class Student__ {
    int studentID;
    String name;
    double marks;

    public Student__(int studentID, String name, double marks) {
        this.studentID = studentID;
        this.name = name;
        this.marks = marks;
    }
    public void displayStudentDetails() {
        System.out.println("\nStudent Name: " + name + "\nStudent ID: " + studentID + "\nStudent Marks: " + marks);
    }
    public boolean isPassed() {
        if(marks>=40) {
            return true;
        } else return false;
    }
}

class College {
    String collegeName;
    String city;
    Student__[] s;

    public College(String collegeName, String city, Student__[] s) {
        this.collegeName = collegeName;
        this.city = city;
        this.s = s;
    }

    public void displayCollegeDetails() {
        System.out.println("\nCollege Name: " + collegeName + "\nCity: " + city);

        int totalStudents = s.length;
        int passed = 0;
        int failed = 0;
        double totalMarks = 0;

        for(int i=0;i<s.length;i++) {
            s[i].displayStudentDetails();
            if(s[i]!=null) {
                System.out.println("Result: " + (s[i].isPassed() ? "Passed" : "Failed"));
                System.out.println();

                totalMarks += s[i].marks;
                if(s[i].isPassed()) passed++;
                else failed++;

            }
        }
        System.out.println("\nTotal Students: " + totalStudents);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average Marks: " + (totalMarks/totalStudents));
    }
}

public class Task5 {
    public static void main (String[] args) {

        Student__ s1 = new Student__(3026,"Asadullah",93);
        Student__ s2 = new Student__(3301,"Yusra",92);
        Student__ s3 = new Student__(3101,"Ashad",81);
        Student__ s4 = new Student__(3100,"Anas",64);
        Student__ s5 = new Student__(3201,"Hashir",38);

        Student__[] student = {s1,s2,s3,s4,s5};

        College college = new College("GOVERNMENT DEGREE BOYS COLLEGE","NAWABSHAH",student);

        college.displayCollegeDetails();
    }
}