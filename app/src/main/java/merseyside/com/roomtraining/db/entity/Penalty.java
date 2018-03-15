package merseyside.com.roomtraining.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity (foreignKeys = @ForeignKey(
        entity = Car.class,
        parentColumns = "number",
        childColumns = "carId"))
public class Penalty {
    @PrimaryKey int id;
    int number;
    int reason;
    int carId;
}
