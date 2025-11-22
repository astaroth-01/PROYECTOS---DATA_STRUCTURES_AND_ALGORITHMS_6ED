/*
*   Estructuras de datos y algoritmos sexta edición Wiley.
*   Problema 2.31
*   Programador: Angel Flores
*   Correo electrónico: miguelangelflto6@gmail.com
*   Problema: Simular un ecosistema que pueda almacenar animales, en especifico
*   osos y peces. Se pueden mover de manera al azar. Si dos animales del mismo tipo
*   estan a punto de acceder a la misma celda, se crea un nuevo animal del mismo tipo.
*   Si un pez y un oso acceden a la misma celda, el pez muere.
*   21 - Noviembre - 2025
 */

package object_oriented_design;

import java.util.Random;

public class Problema_2_31 {
    private static Animal[] river;
    private static final int numOfAnimals = 20;
    
    public static void initializeEcosystem() {
        river = new Animal[numOfAnimals];
        
        Random e = new Random();
        int numFishes = e.nextInt(1,river.length / 2);
        int numBears = e.nextInt(1,river.length / 2);
        
        while(numFishes >= 0) {
            int idx = e.nextInt(0,numOfAnimals - 1);
            river[idx] = new Fish();
            numFishes--;
        }
        
        while(numBears >= 0) {
            int idx = e.nextInt(0,numOfAnimals - 1);
            river[idx] = new Fish();
            numBears--;
        }
    }
    
    public void toTakeStep() {
        
        
    }
}
