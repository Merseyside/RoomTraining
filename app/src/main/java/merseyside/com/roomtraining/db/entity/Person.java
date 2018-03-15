package merseyside.com.roomtraining.db.entity;


import android.arch.persistence.room.PrimaryKey;

public class Person {
    @PrimaryKey int id;
    String name;
    int experience;

    public Person() {

    }
}
