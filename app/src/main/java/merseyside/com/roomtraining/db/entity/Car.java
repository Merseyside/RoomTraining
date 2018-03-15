package merseyside.com.roomtraining.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity (foreignKeys = @ForeignKey(
        entity = Person.class,
        parentColumns = "id",
        childColumns = "ownerId"))
public class Car {
    @PrimaryKey int id;
    String number;
    String model;
    int ownerId;
}
