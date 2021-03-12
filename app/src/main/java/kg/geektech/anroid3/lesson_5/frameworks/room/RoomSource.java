package kg.geektech.anroid3.lesson_5.frameworks.room;

import java.util.List;

import kg.geektech.anroid3.lesson_5.App;
import kg.geektech.anroid3.lesson_5.data.source.StudentSource;
import kg.geektech.anroid3.lesson_5.data.model.Student;

public class RoomSource implements StudentSource {

    @Override
    public void addStudent(Student student) {
        App.roomDb.studentsDao().insertStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return App.roomDb.studentsDao().getAllStudents();
    }
}
