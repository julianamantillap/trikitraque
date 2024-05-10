/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trikitraki;

import javax.swing.JOptionPane;

/**
 *
 * @author julianamantilla
 */
public class tablero {
    
    private char[][] tablero;
    
    public tablero() {
    }
    
    public char[][] getTablero(){
        return tablero;
    }

    public boolean haGanado(char ficha) {
        
        for (int i = 0; i < tablero.length; i++) {
            
            boolean ganafila = true;
            boolean ganacolumna = true;
            
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] != ficha)
                    ganafila = false;             
                if (tablero[j][i] != ficha)
                    ganacolumna = false;
            }
            if (ganafila || ganacolumna)
                return true;   
        }
        
        boolean ganadiagonal1 = true;
        boolean ganadiagonal2 = true;
        
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][i] != ficha)
                ganadiagonal1 = false;
            
            if (tablero[i][tablero.length - 1 - i] != ficha)
                ganadiagonal2 = false;
            
        }
        
        if (ganadiagonal1 || ganadiagonal2)
            return true;
        
        return false;
    }
    
    public boolean esEmpate() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public int colocarFicha(int fila, int columna, char ficha) {
        
        tablero[fila][columna] = ficha;
        if (haGanado(ficha)) {
            JOptionPane.showMessageDialog(null, "Partida Finalizada, el ganador ha sido el jugador con la ficha: " + ficha);
            return 1;
        } else if (esEmpate()) {
            JOptionPane.showMessageDialog(null, "La partida ha quedado empatada");
            return 2;
        }

        return 0;

    }
    
    
    public void inicializarTablero(int tamaño) {
        
        tablero = new char[tamaño][tamaño];
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = ' ';
            }
        }
    }
    
}

    
    
    

