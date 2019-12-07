package db_room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Controlador.AlumnoDAO;
import Entidades.Alumno;

@Database(entities = {Alumno.class},version = 1, exportSchema = false)

public abstract class EscuelaBD  extends RoomDatabase {

    public abstract AlumnoDAO alumnoDAO();

    private static volatile EscuelaBD INSTANCE;
    private static final int NUMBER_OF_THREADS =4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static EscuelaBD getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (EscuelaBD.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            EscuelaBD.class, "escuela")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
