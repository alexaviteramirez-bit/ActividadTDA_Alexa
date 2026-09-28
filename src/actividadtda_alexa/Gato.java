/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadtda_alexa;

/**
 * 
 * @author alexa
 * Clase Hija
 * Representa a un gato, el gato es una mascota
 */
public class Gato extends Mascota{
    // atributos
    private String raza;
    private int edad;
    
     // get y set
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.equals("")) {
            System.out.println("Error: La raza no puede estar vacía.");
        } else {
            this.raza = raza;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Error: La edad no puede ser negativa.");
        } else {
            this.edad = edad;
        }
    }
    
    // Constructor con validaciones simples
    public Gato(String nombre, double peso, String raza, int edad) {
        // Llama al constructor de la clase padre (Mascota)
        super(nombre, peso);
        
        if (raza == null || raza.equals("")) {
            System.out.println("Error: La raza no puede estar vacía.");
            this.raza = "Mestizo";
        } else {
            this.raza = raza;
        }
        
        if (edad < 0) {
            System.out.println("Error: La edad no puede ser negativa.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

     // Método de lógica: determina si el gato es senior (8 años o más)
    public boolean esGatoSenior() {
        return this.edad >= 8;
    }

    // Método de lógica: calcula la edad del gato en años humanos (x7)
    public int calcularEdadHumana() {
        return this.edad * 7;
    }
}
