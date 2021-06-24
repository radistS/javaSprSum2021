CREATE DATABASE IF NOT EXISTS hillel;

USE hillel;

CREATE TABLE IF NOT EXISTS student (
  student_id int(100) NOT NULL AUTO_INCREMENT,
  first_name varchar(50) DEFAULT NULL,
  last_name varchar(50) DEFAULT NULL,
  email varchar(50) DEFAULT NULL,
  phone varchar(50) DEFAULT NULL,
  PRIMARY KEY (student_id)
);

CREATE TABLE IF NOT EXISTS marks_details (
  student_id int(100) NOT NULL,
  test_id int(100) NOT NULL AUTO_INCREMENT,
  subject varchar(100) DEFAULT NULL,
  max_marks varchar(100) DEFAULT NULL,
  marks_obtained varchar(100) DEFAULT NULL,
  result varchar(100) DEFAULT NULL,
  PRIMARY KEY (test_id),
  KEY FK_marks_details_student (student_id),
  CONSTRAINT FK_marks_details_student FOREIGN KEY (student_id) REFERENCES student (student_id)
 );