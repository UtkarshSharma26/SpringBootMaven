package com.utk.DAO;

import com.utk.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDAO {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Amit", "CSE"));
                put(2, new Student(2, "Sumit", "MECH"));
                put(3, new Student(3, "Aryan", "EEE"));

            }
        };
    }

 public Collection<Student> getAllStudents(){
        return this.students.values();
 }
}
