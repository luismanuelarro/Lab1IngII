
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliana Andrea Camayo, Luis Manuel Arroyo 
 */
public class ViajeTodoIncluido extends Viaje {

    public ViajeTodoIncluido(String string, String string1, int i, Date date, Date date1) {
        super(string, string1, i, date, date1);
    }

    // Constructores
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
    //No se sobreescribe cualquierMetodo2() 
}
