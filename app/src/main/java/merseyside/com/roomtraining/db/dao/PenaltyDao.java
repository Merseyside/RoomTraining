package merseyside.com.roomtraining.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import merseyside.com.roomtraining.db.entity.Penalty;

@Dao
public interface PenaltyDao {

    @Query("SELECT * FROM person WHERE carId LIKE :carId")
    List<Penalty> getAllCarPenalties(int carId);

}
