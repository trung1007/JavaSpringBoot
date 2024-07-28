package CaoTrung.springProject.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Trung",
                        "Cao",
                        LocalDate.now(),
                        "trungthanhcao.2003@gmail.com",
                        21
                ),
                new Student(
                        "Hoang",
                        "Ngo",
                        LocalDate.now(),
                        "duyhoangngo.2003@gmail.com",
                        21
                )
        );
    }
}
