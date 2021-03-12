package kg.geektech.anroid3.lesson_5.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "students")
public class Student {

    @PrimaryKey
    private int id;

    private String name;

    private int age;

    @ColumnInfo(name = "course_id")
    private int courseId;

    private double gpa;

    public Student(int id, String name, int age, int courseId, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courseId = courseId;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'';
    }
}
