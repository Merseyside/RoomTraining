package merseyside.com.roomtraining.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import merseyside.com.roomtraining.db.entity.Car;

@Dao
public interface CarDao {

    @Query("SELECT * FROM car WHERE carId LIKE :carId")

    List<Car> getCarById(int ownerId);



}
