package com.e.bd_sqlite_room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Metodo para botones

    public void abrirActivities(View v){
        switch (v.getId()){
            case R.id.btn_agregar: Intent i = new Intent(this,ActivityAltas.class);
            startActivity(i);
            break;
            /*case R.id.btn_eliminar: Intent a = new Intent(this,ActivityAltas.class);
                startActivity(a);
                break;
            case R.id.btn_modificar: Intent b = new Intent(this,ActivityBajas.class);
                startActivity(b);
                break;*/
            case R.id.btn_buscar: Intent c = new Intent(this,ActivityConsultas.class);
                startActivity(c);
                break;

        }
    }
}
