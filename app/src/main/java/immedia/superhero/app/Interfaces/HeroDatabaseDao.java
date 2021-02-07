package immedia.superhero.app.Interfaces;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import immedia.superhero.app.pojo.Result;

@Dao
public interface HeroDatabaseDao {

    @Insert
    public void insertHero(Result result);

    @Query("SELECT * FROM heroes  WHERE heroName = :name")
    List<Result> findHero(String name);
}
