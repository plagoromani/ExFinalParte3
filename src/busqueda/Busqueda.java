package busqueda;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Busqueda {

    public static void main(String[] args) {
        
       
          int numArray = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el número del Array :"));
      
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el número que desees :"));
         int[] numeros = new int[numArray];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, 450, 0, numeros.length - 1);
       JOptionPane.showMessageDialog(null,"El indice del valor " +numArray + " es" + indice);
    }

    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        }
    }
}
