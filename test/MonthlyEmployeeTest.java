import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthlyEmployeeTest {

    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new MonthlyEmployee("test", 25000.0);
    }



    @Test
    void calculateMonthlySalaryTest() {

        // Arrange
        double expected = 25000.0;

        // Act
        double actual = employee.calculateSalary();

        // Assert
        assertEquals(expected, actual);
    }
}