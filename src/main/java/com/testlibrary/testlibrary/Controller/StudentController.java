package com.testlibrary.testlibrary.Controller;

import com.testlibrary.testlibrary.Entity.StudentEntity;
import com.testlibrary.testlibrary.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("students/library")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentEntity>> findAllStudents(){
        List<StudentEntity> retrievedStudents = studentService.findAllStudents();
        return ResponseEntity.status(HttpStatus.OK).body(retrievedStudents);
    }
}
