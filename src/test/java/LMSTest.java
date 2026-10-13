import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LMSTest {
    LMS lms = new LMS();

    @Test
    void testCourseName() {
        assertEquals("Wrong Course", lms.getCourseName());
    }

    @Test
    void testCourseAvailable() {
        assertTrue(lms.isCourseAvailable("Java"));
    }

    @Test
    void testEmptyCourse() {
        assertFalse(lms.isCourseAvailable(""));
    }
}