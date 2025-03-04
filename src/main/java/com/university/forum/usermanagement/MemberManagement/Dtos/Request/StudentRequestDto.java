package com.university.forum.usermanagement.MemberManagement.Dtos.Request;


import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    @NotBlank
    private String addressEmail;

    @Size(min = 8, max = 8)
    private String phoneNumber;

    private String address;

    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;
    @Size(min = 8, message = "Confirm Password must be at least 8 characters long")
    private String confirmPassword;
    private String linkedInProfileUrl;

    @NotBlank
    @Size(min = 8, max = 8, message = "CIN must be exactly 8 digits")
    @Pattern(regexp = "\\d{8}", message = "CIN must contain only digits")
    private String cin;

    @Past
    private LocalDate dob;

    @NotBlank
    private String studentNumber;

    @Min(value = 1, message = "Class group ID must be greater than 0")
    private Integer classGroupId;


}
