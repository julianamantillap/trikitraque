/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trikitraki;

/**
 *
 * @author julianamantilla
 */
public class juego {
    
   private jugador x;
   private jugador o;
   private tablero t;

   public juego() {
   }

    public jugador getX() {
        return x;
    }

    public jugador getO() {
        return o;
    }

    public tablero getT() {
        return t;
    }
    
   public juego(String nombrex, char fichax, String colorx, String nombreo, char fichao, String coloro){
       
       x = new jugador(nombrex, fichax, colorx);
       o = new jugador(nombreo, fichao, coloro);
       t = new tablero();
   }
   
   public char cambiarTurno(char turno){
       if(turno=='X')
           return 'O';
       else
           return 'X';
   }
   
   public void iniciarPartida(int tamaño){
       t.inicializarTablero(tamaño);
   }
   
    public void finalizarPartida() {

        t.inicializarTablero(t.getTablero().length);
    }
  
}
