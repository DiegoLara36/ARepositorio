package uni.edu.pe.pc3_farmacia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;

}
