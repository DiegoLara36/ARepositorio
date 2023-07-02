package uni.edu.pe.demorest.dto;
//data transfer object
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//genera getter and setter gratis
@NoArgsConstructor //genera el constructo por defecto
@AllArgsConstructor //genera un constructor con todos los valores
public class Saludo {

    private String saludar;
    private String ocupacion;
    private String direccion;

    public Saludo(String saludar) {
        this.saludar = saludar;
    }
}
