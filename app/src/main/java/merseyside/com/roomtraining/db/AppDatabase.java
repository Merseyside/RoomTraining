package merseyside.com.roomtraining.db;


import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;

import merseyside.com.roomtraining.db.dao.CarDao;
import merseyside.com.roomtraining.db.dao.PenaltyDao;
import merseyside.com.roomtraining.db.dao.PersonDao;
import merseyside.com.roomtraining.db.entity.Car;
import merseyside.com.roomtraining.db.entity.Penalty;
import merseyside.com.roomtraining.db.entity.Person;


@Database(entities = {Person.class, Car.class, Penalty.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract PersonDao getPersonDao();

    public abstract CarDao getCarDao();

    public abstract PenaltyDao getPenaltyDao();

    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}
