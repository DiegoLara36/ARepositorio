package uni.edu.pe.demorest4basededatos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    private String codigo;
    private String nombre;
    private String descripcion;
    private float precioUnitario;



}
