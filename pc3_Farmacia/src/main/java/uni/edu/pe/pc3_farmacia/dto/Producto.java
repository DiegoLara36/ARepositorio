package uni.edu.pe.pc3_farmacia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private int id_producto;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    private int id_categoria;

}
