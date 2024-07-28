package CaoTrung.springProject.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student save(
            @RequestBody Student student
    ) {
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable("email") String email
    ) {
        return service.findByEmail(email);
    }

    @PutMapping
    public Student update(
            @RequestBody Student student
    ) {
        return service.update(student);
    }

    @DeleteMapping("/{email}")
    public void delete(
            @PathVariable("email") String email
    ) {
        service.deleteByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }
}
