package kg.geektech.anroid3.lesson_5.frameworks;

import java.util.ArrayList;
import java.util.List;

import kg.geektech.anroid3.lesson_5.data.source.StudentSource;
import kg.geektech.anroid3.lesson_5.data.model.Student;

public class MockData implements StudentSource {
    private static final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        student.setName(student.getName() + " MOCK ");
        students.add(student);
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }
}
