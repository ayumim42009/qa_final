import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanDriveTest {

    @Test
    void testMethod1() {
        // Test for age below the driving age
        Assertions.assertEquals(false, canDrive(15), "15 yrs old cannot drive");
    }

    @Test
    void testMethod2() {
        // Test for age exactly at the driving age
        Assertions.assertEquals(true, canDrive(16), "16 yrs old can drive");
    }

    @Test
    void testMethod3() {
        // Test for age above the driving age
        Assertions.assertEquals(true, canDrive(18), "18 yrs old can drive");
    }

    @Test
    void testMethod4() {
        // Test for invalid input (negative age)
        Assertions.assertEquals(false, canDrive(-1), "Invalid input: age cannot be negative");
    }

    @Test
    void testMethod5() {
        // Test for below driving age (zero)
        Assertions.assertEquals(false, canDrive(0), "0 yr old cannot drive");
    }

    /**
     * CanDrive function
     */
    private static boolean canDrive(int age) {
        int drivingAge = 16;
        return age >= drivingAge;
    }
}
