package kg.geektech.anroid3.lesson_5.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import kg.geektech.anroid3.lesson_5.App;
import kg.geektech.anroid3.lesson_5.R;
import kg.geektech.anroid3.lesson_5.data.model.Course;
import kg.geektech.anroid3.lesson_5.data.model.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student student1 = new Student(1, "Student Android", 20, 3, 1.3);
        Course android_3 = new Course(3, "Android-3", 15);

        Student student2 = new Student(2, "Student Python", 20, 2, 4.0);
        Course python = new Course(2, "Python", 15);

        App.studentRepository.addStudent(student1);
        log(App.studentRepository.getStudents().toString());
    }

    private void log(String msg) {
        Log.d("tag", msg);
    }
}