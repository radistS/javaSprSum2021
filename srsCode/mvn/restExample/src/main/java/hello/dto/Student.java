package hello.dto;

import java.util.UUID;

/**
 * @author Alex Stepurko
 * @version 0.0.2
 * <p>
 * DTO class for store information about student
 */
public class Student {

    private UUID id;
    private String firstName;
    private String lastName;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(UUID id) {
        this.id = id;
    }

    public Student(UUID id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Student(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    @Deprecated
    /**
     * @since 1.0.0
     * @deprecated from 1.1.1
     */
    public String getFullName() {
        return lastName + " " + firstName;
    }
}
