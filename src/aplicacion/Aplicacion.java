/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import notaprimertrimestre.*;
import persoal.Persoal;

/**
 *
 * @author aalvarezbretana
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        
        Persoal pers1 = new Persoal("666123123", "primerapersona@gmail.com");
        NotaMedia oc1 = new NotaMedia();
        int nota1 = oc1.calcularNotaMedia();
        Academia acade = new Academia("Primer Sujeto", nota1, pers1);
        Persoal pers2= new Persoal("666321321","segundapersona@gmail.com");
        NotaMedia oc2 = new NotaMedia();
        int nota2 = oc2.calcularNotaMedia();
        Academia acade2 = new Academia("Segundo Sujeto", nota2, pers2);
        System.out.println(acade.toString());
        System.out.println(acade2.toString());
    }
}
