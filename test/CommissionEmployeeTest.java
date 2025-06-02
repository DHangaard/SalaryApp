import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {

    private Employee employee;

    @BeforeEach
    void setUp() {
    employee = new CommissionEmployee("test", 20000.0, 10000.0, 0.2);
    }

    @Test
    void calculateSalary() {

        // Arrange
        double expected = 22000.0;

        // Act
        double actual = employee.calculateSalary();

        // Assert
        assertEquals(expected, actual);
    }
}