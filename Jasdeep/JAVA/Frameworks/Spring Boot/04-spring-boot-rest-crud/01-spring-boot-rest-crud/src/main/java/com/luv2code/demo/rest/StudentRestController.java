package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    //define @PostConstruct to load the student data... only one!

    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
    }

    //define an endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;

    }

    //define endpoint or "/student/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public  Student getStudent(@PathVariable int studentId){


// just index into the list... keep it simple for now

        //checck the studentsId again list size

        if ((studentId>=theStudents.size()) || (studentId<0)){
            throw new StudentNotFoundException("Student id not found - "+studentId);
        }

        return theStudents.get(studentId);
    }

    //Add an exception handler using @ExceptionHandler



}
