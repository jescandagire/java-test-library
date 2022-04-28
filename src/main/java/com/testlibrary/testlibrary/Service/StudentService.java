package com.testlibrary.testlibrary.Service;

import com.testlibrary.testlibrary.Entity.StudentEntity;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    @PostConstruct
    public List<StudentEntity> findAllStudents(){
        List<StudentEntity> students = new ArrayList<>();
        StudentEntity studentArray[] = new StudentEntity[2];
        studentArray[0] = new StudentEntity(1, "Alex");
        studentArray[1] = new StudentEntity(2, "Jesca");
        students.addAll(Arrays.asList(studentArray));
        return students;
    }
}
