package com.javabeast.domain;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateAccountDto {
    @NotNull
    @Size(min = 2, max = 30)
    private String email;
    @NotNull
    @Size(min = 2, max = 30)
    private String password;
    @NotNull
    @Size(min = 2, max = 30)
    private String confirmPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
