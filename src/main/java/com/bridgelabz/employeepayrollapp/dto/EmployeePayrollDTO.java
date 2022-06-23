package com.bridgelabz.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name Invalid")
    public  String name;
    @Min(value = 500, message = "Min Wage should be more than 500")
    public long salary;

    @Pattern(regexp = "male|female", message = "Gender needs to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd MMM yyyy")
    @NotNull(message = "Start Date Should not be empty")
    @PastOrPresent(message = "Start date should be Past or today's date")
    public LocalDate startDate;

    @NotNull(message = "Note Can Not Be Empty")
    public String note;

    @NotBlank(message = "Profile Pic Can not be Empty")
    public String profilePic;

    @NotNull(message = "Departments should not be Empty")
    public List<String> departments;
}
