package hello.controller;

import hello.dto.Student;
import hello.dto.StudentCreate;
import hello.service.StudentGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    List<Student> students = StudentGenerator.studentList();

    @GetMapping("students")
    List<Student> getStudents(){
        return students;
    }

    @GetMapping("students/{uuid}")
    Student getStudent(@PathVariable UUID uuid){
        return students.stream().filter(s -> s.getId().equals(uuid)).findFirst().orElse(null);
    }

    @PostMapping("student")
    UUID createStudent(@RequestBody StudentCreate student){
        UUID uuid = UUID.randomUUID();
        students.add(new Student(uuid, student.getFirstName(), student.getLastName()));
        return uuid;
    }


    @PutMapping("student")
    Student updateStudent(@RequestBody Student student){
        Optional<Student> first = students.stream().filter(s -> s.getId().equals(student.getId())).findFirst();
        Student st = null;
        if (first.isPresent()){
            st = first.get();
            st.setFirstName(student.getFirstName());
            st.setLastName(student.getLastName());
        }

        return st;
    }

    @DeleteMapping("student/{uuid}")
    Boolean deleteStudent(@PathVariable UUID uuid){

         students = students.stream().filter(s -> !s.getId().equals(uuid)).collect(Collectors.toList());

         return true;
    }
}
