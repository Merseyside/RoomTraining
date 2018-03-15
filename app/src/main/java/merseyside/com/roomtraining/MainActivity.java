package merseyside.com.roomtraining;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import merseyside.com.roomtraining.db.AppDatabase;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {

    private final String db_name = "auto_db";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, db_name).build();
        db.getPersonDao().getAllPeople()
    }
}
