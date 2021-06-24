package com.projects.example.hibernate.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "marks_details")
public class MarksDetails {

    @Id
    @GeneratedValue
    @Column(name = "test_id")
    private long testId;

    @Column(name = "subject")
    private String subject;

    @Column(name = "max_marks")
    private String maxMarks;

    @Column(name = "marks_obtained")
    private String marksObtained;

    @Column(name = "result")
    private String result;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
