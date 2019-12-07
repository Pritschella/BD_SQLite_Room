package Entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Alumno {

    @NonNull
    @PrimaryKey
    public String numControl;

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.nombre = numControl;
    }
    @NonNull
    @ColumnInfo(name = "nombre")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @NonNull
    @ColumnInfo(name = "primerAp")
    private String primerAp;

    public String getPrimerAp() {
        return primerAp;
    }

    public void setPrimerAp(String primerAp) {
        this.nombre = primerAp;
    }
    @NonNull
    @ColumnInfo(name = "segundoAp")
    private String segundoAp;

    public String getSegundoAp() {
        return segundoAp;
    }

    public void setSegundoAp(String segundoAp) {
        this.nombre = segundoAp;
    }

    @NonNull
    @ColumnInfo(name = "edad")
    private byte edad;

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @NonNull
    @ColumnInfo(name = "carrera")
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.nombre = carrera;
    }

    @NonNull
    @ColumnInfo(name = "semestre")
    private byte semestre;

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.nombre = semestre;
    }

    public Alumno(@NonNull String numControl, String primerAp, String segundoAp, byte edad, byte semestre, String carrera) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.edad = edad;
        this.semestre = semestre;
        this.carrera = carrera;
    }
}
