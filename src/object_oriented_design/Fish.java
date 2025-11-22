/*
*   Problema 2.31
*   Programador: Angel Flores
*   Correo electrónico: miguelangelflto6@gmail.com
*   21 - Noviembre - 2025
 */

package object_oriented_design;

public class Fish implements Animal{
    private final String TYPE = "Fish";
    
    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public Animal toReproduce() {
        return new Fish();
    }
    
}
