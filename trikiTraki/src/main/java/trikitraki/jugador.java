/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trikitraki;

/**
 *
 * @author julianamantilla
 */
public class jugador {
    
    private String nombre;
    private char ficha;
    private String color;

    public jugador(String nombre, char ficha, String color) {
        this.nombre = nombre;
        this.ficha = ficha;
        this.color = color;
        }
    
    public jugador (){     
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public char getFicha() {
        return ficha;
    }

    public String getColor() {
            return color;
        }
    
    
    
}

    

