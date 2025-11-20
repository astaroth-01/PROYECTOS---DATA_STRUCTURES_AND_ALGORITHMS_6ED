/*
*   Estructuras de datos y algoritmos sexta edición Wiley.
*   Programador: Angel Flores
*   Correo electrónico: miguelangelflto6@gmail.com
*
*   Problema: Diseñar un programa que cuente el número de letras del abcedario
*   que aparecen en un documento de texto.
*   19 - Noviembre - 2025
 */
package object_oriented_design;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.in;
import java.util.HashMap;
import java.util.Map;

public class problem_2_32 {

    private static Map<Character, Integer> alphabet = new HashMap<>();

    public static void main(String... args) {
        for (char abc = 'a'; abc <= 'z'; abc++) {
            alphabet.put(abc, 0);
        }

        String file = "File Name";
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));

            int unicode;
            while ((unicode = in.read()) != -1) {
                char character = (char) unicode;
                char lowerChar = toLowerCase(character);

                if (alphabet.containsKey(lowerChar)) {
                    alphabet.put(lowerChar, alphabet.get(lowerChar) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("file not found");
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println("Error closing the flie");
            }
        }
        
        for (char abc = 'a'; abc <= 'z'; abc++)
            System.out.printf("%s%d%n",abc, alphabet.get(abc));
    }

    private static char toLowerCase(char c) {
        String character = String.valueOf(c).toLowerCase();
        char newCharacter = character.charAt(0);
        return newCharacter;
    }
}
