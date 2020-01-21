/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import persoal.Persoal;

/**
 *
 * @author aalvarezbretana
 */
public class Academia {

    private String nombre;
    private int nota;
    private Persoal alum = new Persoal();
    private long numReferencia;
    public static long referencia = 2020;

    public Academia() {
        numReferencia = referencia;
        referencia++;
    }

    public Academia(String nombre, int nota, Persoal alum) {

        this.nombre = nombre;
        this.nota = nota;
        this.alum = alum;
        numReferencia = referencia;
        referencia++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    public long getNumReferencia() {
        return numReferencia;
    }

    @Override
    public String toString() {
        return "Academia{" + "nombre=" + nombre + ", nota=" + nota + ", alum=" + alum + ", numReferencia=" + numReferencia + '}';
    }

}
