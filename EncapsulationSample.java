public class EncapsulationSample {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student student1 = new Student();
        
        // Setting the student ID and name using the setter methods
        student1.setStudentId(1234);
        student1.setName("Student_1");

        // Printing the student ID and name using the getter methods
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getName());

        // Practical Exercise: Creating an instance of Book
        Book book1 = new Book();
        
        // Setting the book attributes using the setter methods
        book1.setBookNumber(101);
        book1.setTitle("Alitaptap");
        book1.setAuthor("Abigail Cañero");
        book1.setPrice(349.99);

        // Printing the book details using the getter methods
        System.out.println("\nBook Details:");
        System.out.println("Book Number: " + book1.getBookNumber());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: Php" + book1.getPrice());
    }
}

class Student {
    // Private attributes
    private int Student_Id;
    private String Name;

    // Setter for Student_Id
    public void setStudentId(int Student_Id) {
        this.Student_Id = Student_Id;
    }

    // Getter for Student_Id
    public int getStudentId() {
        return Student_Id;
    }

    // Setter for Name
    public void setName(String Name) {
        this.Name = Name;
    }

    // Getter for Name
    public String getName() {
        return Name;
    }
}

// Practical Exercise: Creating the Book class
class Book {
    // Private attributes
    private int book_number;
    private String title;
    private String author;
    private double price;

    // Setters and Getters for each attribute
    public void setBookNumber(int book_number) {
        this.book_number = book_number;
    }

    public int getBookNumber() {
        return book_number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}