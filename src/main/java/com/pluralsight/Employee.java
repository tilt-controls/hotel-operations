package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;


    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }
    public double getTotalPay() {
        return  (payRate * getRegularHours()) + ((payRate * 1.5) * getOvertimeHours());
    }
    public void punchIn(int time) {
        startTime = time;
    }
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        startTime = now.getHour() + now.getMinute() / 60.0;
    }
    public void punchOut(int time) {
        hoursWorked += time - startTime;
    }
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        hoursWorked += now.getHour() + now.getMinute() / 60.0 - startTime;
    }

}
