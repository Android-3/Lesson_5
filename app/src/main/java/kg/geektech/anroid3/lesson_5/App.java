package kg.geektech.anroid3.lesson_5;

import android.app.Application;

import androidx.room.Room;

import kg.geektech.anroid3.lesson_5.data.repo.StudentRepository;
import kg.geektech.anroid3.lesson_5.frameworks.MockData;
import kg.geektech.anroid3.lesson_5.frameworks.room.AppDatabase;

public class App extends Application {

    public static StudentRepository studentRepository;
    public static AppDatabase roomDb;

    @Override
    public void onCreate() {
        super.onCreate();
        roomDb = Room.databaseBuilder(
                this,
                AppDatabase.class,
                "android-3"
        )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

        studentRepository = new StudentRepository(new MockData());
    }
}
