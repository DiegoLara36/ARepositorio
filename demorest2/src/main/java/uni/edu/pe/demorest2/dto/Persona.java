package uni.edu.pe.demorest2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter and setter
@NoArgsConstructor//constructor por defecto
@AllArgsConstructor//todos tieenn constructor
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;


}
