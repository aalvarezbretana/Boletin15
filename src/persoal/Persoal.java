/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persoal;

/**
 *
 * @author aalvarezbretana
 */
public class Persoal {

    private String telefono;
    private String email;

    public Persoal() {

    }

    public Persoal(String telefono, String email) {
        this.telefono = telefono;
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persoal{" + "telefono=" + telefono + ", email=" + email + '}';
    }

}
