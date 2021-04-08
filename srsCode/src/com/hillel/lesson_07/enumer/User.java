package com.hillel.lesson_07.enumer;

public class User {
    String email;
    UserStatus status;

    public User(String email) {
        this.email = email;
        this.status = UserStatus.PENDING;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserL{" +
                "email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}
