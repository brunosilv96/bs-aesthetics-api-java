package com.bsaesthetics.bs_aesthetics_api.domain.account.dto;

import java.time.LocalDate;

import com.bsaesthetics.bs_aesthetics_api.domain.account.RoleEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RegisterAccountRequest {
    @NotBlank(message = "name is required")
    @Size(max = 50, min = 3, message = "name must have between 3 and 50 characters")
    String name;

    @NotBlank(message = "email is required")
    @Email(message = "email is invalid")
    String email;

    @NotBlank(message = "password is required")
    @Size(min = 8, message = "password must have 8 minimum characters")
    String password;

    @NotBlank(message = "phone is required")
    @Pattern(regexp = "^\\d{10,11}$", message = "phone must have 11 minimum characters")
    String phone;

    @NotBlank(message = "birthdate is required")
    @Past(message = "the date of birth should be in the previous section")
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate birthdate;

    RoleEnum role;

    public RegisterAccountRequest() {
    }

    public RegisterAccountRequest(String name, String email, String password, String phone, LocalDate birthdate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthdate = birthdate;
        this.role = RoleEnum.CLIENT;
    }
}
