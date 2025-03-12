/**
 * The Main class serves as the entry point of the application.
 * It contains the main method that initializes and runs the application.
 */
public class Main {
    /**
     * Entry point of the program.
     * Initializes the application and starts the execution.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args)  {
        // Check if Student class has the @HW annotation
        if (MyHomework.class.isAnnotationPresent(HW.class)) {
            HW hwAnnotation = MyHomework.class.getAnnotation(HW.class);
            // Extract and display the annotation values
                System.out.println("Teacher: " + hwAnnotation.teacher());
                System.out.println("Email: " + hwAnnotation.email());
                System.out.println("Course: " + hwAnnotation.course());
                System.out.println("Year: " + hwAnnotation.year());
                System.out.println("MSC Program: " + hwAnnotation.mscProgram());
            } else {
                System.out.println("No HW annotation found on MyHomework class.");
            }

    }
}
//        javadoc -d doc src/*.java
//        After running the command, open the doc/index.html file in a web browser to see the documentation.
