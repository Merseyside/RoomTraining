package merseyside.com.roomtraining.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import merseyside.com.roomtraining.db.entity.Person;

@Dao
public interface PersonDao {

    @Insert
    void insertAll(Person... people);

    @Delete
    void delete(Person person);

    @Query("SELECT * FROM person")
    List<Person> getAllPeople();

    @Query("SELECT * FROM person WHERE experience LIKE :experience")
    List<Person> getPersonExperience(int experience);
}
