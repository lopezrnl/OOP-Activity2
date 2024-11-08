// Main class to test the hierarchy
public class InheritanceSample {
    public static void main(String[] args) {
        // Creating Student object
        Student student = new Student("Raniel", "San Piro", "Information Technology", 2);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());

        // Creating Staff object
        Staff staff = new Staff("Abby", "Dalig", "ICC", 999.99);
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getAddress());
        System.out.println("Staff School: " + staff.getSchool());
        System.out.println("Staff Salary: PHP " + staff.getSalary());
    }
}
// Base class: Person
class Person {
    protected String name;
    protected String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

// Subclass: Student
class Student extends Person {
    private String program;
    private int year;

    // Constructor
    public Student(String name, String address, String program, int year) {
        super(name, address);
        this.program = program;
        this.year = year;
    }

    // Setters
    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }
}

// Subclass: Staff
class Staff extends Person {
    private String school;
    private double salary;

    // Constructor
    public Staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    // Setters
    public void setSchool(String school) {
        this.school = school;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters
    public String getSchool() {
        return school;
    }

    public double getSalary() {
        return salary;
    }
}
