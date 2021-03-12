package kg.geektech.anroid3.lesson_5.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "courses")
public class Course {

    @PrimaryKey
    private int id;

    private String name;

    @ColumnInfo(name = "students_count")
    private int studentsCount;

    public Course(int id, String name, int studentsCount) {
        this.id = id;
        this.name = name;
        this.studentsCount = studentsCount;
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

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'';
    }
}
