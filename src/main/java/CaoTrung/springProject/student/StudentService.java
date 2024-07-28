package CaoTrung.springProject.student;

import java.util.List;
import java.util.Optional;


public interface StudentService {

    List<Student> findAllStudents();
    Student save(Student s);
    Student findByEmail(String email);
    Student update(Student s);
    void deleteByEmail(String email);
}
