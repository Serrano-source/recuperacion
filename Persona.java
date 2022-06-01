/*Author: David Serrano*/

/*Esto es la clase persona que te 3 atributs que son num_dni, nom y adreça */
public class Persona {
    private int num_dni;
    private String nom;
    private String adreça;

    Persona(int pdni) {
        num_dni = pdni;
    }

    Persona(int pdni, String pnom) {
        num_dni = pdni;
        nom = pnom;
    }
/* A partir de aqui el que surt son setters y getters, de cadascun dels tres atributs  */
    public int getDNI() {
        return (num_dni);
    }

    public String getNom() {
        return (nom);
    }

    public setNom(String pnom) {
        nom = pnom;
    }

    public String getAdreça() {
        return (adreça);
    }

    public setAdreça(String padreça) {
        adreça = padreça;
    }
}
