package model.repository.impl;

import model.bean.Student;
import model.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentRepositoryOther implements IStudentRepository {
    static Map<Integer, Student> studentMap = new TreeMap<>();

    static {
        studentMap.put(654, new Student(654, "Nguyen Van A IV",
                "2000-08-03", 1, 4.0));
        studentMap.put(874, new Student(874, "Mai Thi C IV",
                "2000-08-08", 0, 9.0));
        studentMap.put(435, new Student(435, "Le Van D IV",
                "2000-12-04", 1, 7.0));
    }


    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }
}
