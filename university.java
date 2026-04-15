import java.util.*;
// Base Class
class Employee {

    protected String name;
    protected String designation;
    protected String department;
    protected int salary;

    // Parameterized Constructor
    Employee(String name, String designation, String department, int salary) {
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    // Increment Function
    public int increment() {
        int oldSalary = salary;
        salary = salary + (salary * 10 / 100);
        return oldSalary;
    }
}

// Inherit Class
class Faculty extends Employee {

    protected int workingHours;
    protected Course[] courseList; // array
    protected int AssignedCourse = 0;
    protected int TotalCreditHours = 0;

    // Parameterized Constructor with Super
    Faculty(int workingHours, Course[] courseList, String name, String designation, String department, int salary) {
        super(name, designation, department, salary);
        this.workingHours = workingHours;
        this.courseList = courseList;
    }

    // Getters
    public int getWorkingHours() {
        return workingHours;
    }

    public Course[] getCourseList() {
        return courseList;
    }

    // AssignCourse Methods
    public void AssignCourse(Course course[]) {

        if(getDepartment().equals("Computer Science")) {
            for(int i=0; i<course.length; i++) {
                if(course[i].getCourseCode().charAt(0) == 'C') {
                    this.courseList[AssignedCourse] = course[i];
                    AssignedCourse++;
                    TotalCreditHours += Integer.parseInt(course[i].getCreditHours());
                    if(TotalCreditHours > 12) {
                        System.out.println("Warning: Credit hours exceed 12!");
                    }
                    break;
                }
            }
        }

        if(getDepartment().equals("Management Science")) {
            for(int i=0; i<course.length; i++) {
                if(course[i].getCourseCode().charAt(0) == 'M') {
                    this.courseList[AssignedCourse] = course[i];
                    AssignedCourse++;
                    TotalCreditHours += Integer.parseInt(course[i].getCreditHours());
                    if(TotalCreditHours > 12) {
                        System.out.println("Warning: Credit hours exceed 12!");
                    }
                    break;
                }
            }
        }

        if(getDepartment().equals("Electrical Engineering")) {
            for(int i=0; i<course.length; i++) {
                if(course[i].getCourseCode().charAt(0) == 'E') {
                    this.courseList[AssignedCourse] = course[i];
                    AssignedCourse++;
                    TotalCreditHours += Integer.parseInt(course[i].getCreditHours());
                    if(TotalCreditHours > 12) {
                        System.out.println("Warning: Credit hours exceed 12!");
                    }
                    break;
                }
            }
        }
    }

    // Salary Calculation Method
    public void Salary() {
        if(getWorkingHours() == 36) {
            System.out.println("Salary: " + getSalary());
        }
        else if(getWorkingHours() > 36) {
            int extraHours = workingHours - 36;
            int updatedSalary = getSalary() + (extraHours * 1000);
            System.out.println("Updated Salary: " + updatedSalary);
        }
    }

    // Increment Method
    Faculty increments() {
        salary = salary + (salary * 20/100);
        if(designation.equals("Instructor")) {
            designation = "Lecturer";
        } else if(designation.equals("Lecturer")) {
            designation = "Assistant Professor";
        }
        return this;
    }
}

// New Class
class Course {

    private String CourseName;
    private String CourseCode;
    private String CreditHours;

    //Parameterized Constructor
    Course(String CourseName, String CourseCode, String CreditHours) {
        this.CourseName = CourseName;
        this.CourseCode = CourseCode;
        this.CreditHours = CreditHours;
    }

    // Getters
    public String getCourseName() {
        return CourseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public String getCreditHours() {
        return CreditHours;
    }
}

// Another Inherit Class
class Staff extends Employee {
    int overTimeHours;

    Staff(int overTimeHours, String name, String designation, String department, int salary) {
        super(name, designation, department, salary);
        this.overTimeHours = overTimeHours;
    }

    // Overloading Function -> same name diff parameters
    public boolean Verify(String dep) {
        return department.equals(dep);
    }
    public boolean Verify(int min, int max) {
        return salary >= min && salary <=max;
    }

    // Add method
    public int add(Faculty f) {
        return salary + f.salary;
    }

}

// Main Class
public class university {
    public static void main(String[] args) {

        Employee obj1 = new Employee("Ali","Lecturer","Electrical Engineering",150000);
        int increased10percentage = obj1.increment();

        Faculty obj2 = new Faculty(0,null,"Jawad","Instructor","Computer Science",100000);
        obj2 = obj2.increments();

        Faculty obj3 = new Faculty(0,null," Naveed","Instructor","Management Science",100000);

        Staff obj4 = new Staff(0,"Majeed","Instructor","Computer Science",100000);
        int sumOfSalaries = obj4.add(obj3);

    }
}