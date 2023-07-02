package uni.edu.pe.demo3restbasedatos.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // constructor sin parametros
@AllArgsConstructor // constructor con parametros
public class Alumno {
    private String codigo;
    private String clave;
    private int edad;

}
