import model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello again!");
        Student student = new Student("Adam", Long.parseLong("3149"), 24);
        System.out.println(student.toString());
    }
}