package kg.geektech.anroid3.lesson_5.frameworks.room.temp_tables;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import kg.geektech.anroid3.lesson_5.data.model.Course;
import kg.geektech.anroid3.lesson_5.data.model.Student;

public class StudentCourse {

    @Embedded
    public Student student;

    @Relation(entityColumn = "id", parentColumn = "course_id")
    public List<Course> courseList;

    @Override
    public String toString() {
        return "StudentCourse{" +
                "student=" + student +
                ", courseList=" + courseList +
                '}';
    }
}
