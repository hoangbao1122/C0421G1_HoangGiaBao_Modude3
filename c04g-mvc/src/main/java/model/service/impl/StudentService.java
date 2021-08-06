package model.service.impl;

import model.bean.Student;
import model.repository.IStudentRepository;
import model.repository.impl.StudentRepository;
import model.repository.impl.StudentRepositoryOther;
import model.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {

    // DI = Dependency Inversion
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public List<Student> findAll() {
        return this.iStudentRepository.findAll();
    }
}
