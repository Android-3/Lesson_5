package kg.geektech.anroid3.lesson_5.frameworks.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import kg.geektech.anroid3.lesson_5.frameworks.room.dao.StudentsDao;
import kg.geektech.anroid3.lesson_5.data.model.Course;
import kg.geektech.anroid3.lesson_5.data.model.Student;

@Database(entities = { Student.class, Course.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract StudentsDao studentsDao();
}
