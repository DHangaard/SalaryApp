import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    private Employee employee;

    @BeforeEach
    void setup() { employee = new HourlyEmployee("test", 150.0, 100.0); }

    @Test
    void calculateHourlySalaryTest() {

        // Arrange
        double expected = 15000.0;

        // Act
        double actual = employee.calculateSalary();

        // Assert
        assertEquals(expected, actual);
    }
}