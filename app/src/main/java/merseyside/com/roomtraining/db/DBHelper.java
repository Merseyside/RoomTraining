package merseyside.com.roomtraining.db;


import merseyside.com.roomtraining.db.entity.Person;

public class DBHelper {

    public void fillDB(AppDatabase db) {
        db.getPersonDao().insertAll();
    }

    private Person[] generatePeople() {
        return new Person[] {new Person()}
    }
}
