package kg.geektech.anroid3.lesson_5.frameworks.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import kg.geektech.anroid3.lesson_5.data.model.Course;
import kg.geektech.anroid3.lesson_5.data.model.Student;
import kg.geektech.anroid3.lesson_5.frameworks.room.temp_tables.StudentCourse;

@Dao
public interface StudentsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertStudent(Student student);

    @Delete
    void deleteStudent(Student student);

    @Update
    void updateStudent(Student student);

    @Query("SELECT * FROM students")
    List<Student> getAllStudents();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCourse(Course course);

    @Transaction
    @Query("SELECT * FROM students")
    List<StudentCourse> getCourseStudents();
}
