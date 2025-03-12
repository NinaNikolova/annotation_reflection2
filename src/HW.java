import java.lang.annotation.*;

/**
 * Custom annotation to represent homework metadata.
 */
// 1.4. Use @Documented to include this annotation in the generated documentation
@Documented
@Target({ElementType.TYPE})  // Applied to classes
@Retention(RetentionPolicy.RUNTIME)  // Retained at runtime for reflection
public @interface HW {
    /**
     * The name of the teacher.
     * @return teacher name
     */
    String teacher();
    /**
     * The email address of the teacher.
     * @return teacher email
     */
    String email();
    /**
     * The course name associated with the homework.
     * @return course name
     */
    String course();
    /**
     * The year of the homework.
     * @return year
     */
    String year();
    /**
     * The msc program related to the homework.
     * @return MSc program
     */
    String mscProgram();
}
