package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchIn_punchOut_should_calculateHoursWorked() {
        // arrange
        Employee employee = new Employee("12345", "Mr Worldwide", "Front Desk",
                20, 0);
        double expectedHoursWorked = 4;

        // act
        employee.punchIn(10);
        employee.punchOut(14);

        // assert
        assertEquals(expectedHoursWorked, employee.getHoursWorked());
    }
    @Test
    public void punchIn_punchOut_should_addTimeToExistingHoursWorked() {
        // arrange
        Employee employee = new Employee("12345", "Mr Worldwide", "Front Desk",
                20, 8);
        double expectedHoursWorked = 10;

        // act
        employee.punchIn(13);
        employee.punchOut(15);

        // assert
        assertEquals(expectedHoursWorked, employee.getHoursWorked());
    }
}