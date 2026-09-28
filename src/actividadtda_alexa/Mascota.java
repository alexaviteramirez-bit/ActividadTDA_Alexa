/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadtda_alexa;
/**
 *
 * @author Alexa Virginia Vite Ramírez
 * Clase Padre (TDA).
 * Es cualquier tipo de animal
 */
public class Mascota {
    // Atributos 
    private String nombre;
    private double peso;
    
    // Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.equals("")) {
            System.out.println("Error: El nombre no puede estar vacío.");
        } else {
            this.nombre = nombre;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            System.out.println("Error: El peso debe ser mayor a 0.");
        } else {
            this.peso = peso;
        }
    }
    
     // Constructor
    public Mascota(String nombre, double peso) {
        if (nombre == null || nombre.equals("")) {
            System.out.println("Error: El nombre no puede estar vacío.");
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
        
        if (peso <= 0) {
            System.out.println("Error: El peso debe ser mayor a 0.");
            this.peso = 1.0;
        } else {
            this.peso = peso;
        }
    }
    
        // Método lógica: calcula la dosis diaria de medicina (0.5 ml por kg)
    public double calcularDosisMedicina() {
        return this.peso * 0.5;
    }

    // Método recursivo: calcula la dosis total para varios días
    public double calcularDosisRecursiva(int dias) {
        if (dias <= 0) {
            return 0;
        }
        return calcularDosisMedicina() + calcularDosisRecursiva(dias - 1);
    }
}
