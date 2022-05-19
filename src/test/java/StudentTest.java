import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student("Jenna", 30);
    @Test
    void getName() {
        assertEquals("Jenna", student.getName());
    }

    @Test
    void getAge() {
        assertEquals(30, student.getAge());
    }


}