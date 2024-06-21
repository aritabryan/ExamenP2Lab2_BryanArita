
import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Personas implements Serializable{
    
private String Nombre, ID;
private ArrayList<LibrosBinarios> ArrayLibros;

    public Personas(String Nombre, String ID, ArrayList<LibrosBinarios> ArrayLibros) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.ArrayLibros = ArrayLibros;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<LibrosBinarios> getArrayLibros() {
        return ArrayLibros;
    }

    public void setArrayLibros(ArrayList<LibrosBinarios> ArrayLibros) {
        this.ArrayLibros = ArrayLibros;
    }

    @Override
    public String toString() {
        return "Miembro [" + "Nombre=" + Nombre + ", ID=" + ID + ", LibrosPrestados=" + ArrayLibros +"]";
    }

}
