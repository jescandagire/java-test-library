package com.testlibrary.testlibrary.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    private long studentId;
    private String name;
}
