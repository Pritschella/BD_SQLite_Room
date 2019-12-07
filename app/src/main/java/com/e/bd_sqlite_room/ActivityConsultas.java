package com.e.bd_sqlite_room;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.List;

import Entidades.Alumno;
import db_room.EscuelaBD;

public class ActivityConsultas extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas);

        new

    Thread(new Runnable() {
        @Override
        public void run () {
            EscuelaBD bd = Room.databaseBuilder(getApplicationContext(), EscuelaBD.class, "escuela").build();

            bd.alumnoDAO().insertatRegistros(new Alumno("1", "1", "1", (byte) 1, (byte) 1, "1"));
            bd.alumnoDAO().insertatRegistros(new Alumno("2", "1", "2", (byte) 2, (byte) 2, "2"));
            bd.alumnoDAO().insertatRegistros(new Alumno("3", "3", "3", (byte) 3, (byte) 3, "3"));
            List<Alumno> alumnoList = bd.alumnoDAO().getAll();
            for (Alumno a : alumnoList) {
                Log.i("Alumno->", a.toString());
            }
        }

    });
    }

}




