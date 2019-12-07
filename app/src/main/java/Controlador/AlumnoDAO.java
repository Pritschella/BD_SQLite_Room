package Controlador;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import Entidades.Alumno;

@Dao
public interface AlumnoDAO {
    @Query("SELECT * FROM alumno")
    List<Alumno> getAll();

   /* @Query("SELECT * FROM alumno WHERE  numControl IN (:nc)")
    List<Alumno> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    User findByName(String first, String last);*/

    @Insert
    void insertAll(Alumno... alumnos);

    @Insert
    void insertatRegistros(Alumno alumno);

    @Delete
    void delete(Alumno alumno);

}
