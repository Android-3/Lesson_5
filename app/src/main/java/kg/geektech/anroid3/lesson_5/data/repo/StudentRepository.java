package kg.geektech.anroid3.lesson_5.data.repo;

import java.util.List;

import kg.geektech.anroid3.lesson_5.data.source.StudentSource;
import kg.geektech.anroid3.lesson_5.data.model.Student;

public class StudentRepository {

    private final StudentSource studentSource;

    public StudentRepository(StudentSource studentSource) {
        this.studentSource = studentSource;
    }

    public void addStudent(Student student) {
        studentSource.addStudent(student);
    }

    public List<Student> getStudents() {
        return studentSource.getStudents();
    }

}
