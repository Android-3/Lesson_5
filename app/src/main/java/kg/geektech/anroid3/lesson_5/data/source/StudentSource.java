package kg.geektech.anroid3.lesson_5.data.source;

import java.util.List;

import kg.geektech.anroid3.lesson_5.data.model.Student;

public interface StudentSource {
    void addStudent(Student student);
    List<Student> getStudents();
}
