package uni.edu.pe.demorest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.demorest.dto.Saludo;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SaludoController {
    @RequestMapping(value="/hello2",method = RequestMethod.GET)
    //request mapping es un get, puede ser @GetMapping
    public Saludo sayHello2(){

        return  new Saludo("hola mundo");
    }
    @RequestMapping(value="/saludoComplejo",method = RequestMethod.GET)
    //request mapping es un get, puede ser @GetMapping
    public List <Saludo> saludoComplejo(){
        List<Saludo> saludos = new ArrayList<>();
        Saludo saludo = new Saludo();
        saludo.setDireccion("mi casa");
        saludo.setOcupacion("profesor");
        saludo.setOcupacion("profesor");
        saludo.setSaludar("Hi oni");
        System.out.println(saludo);

        Saludo saludo2 = new Saludo("hi estudiante","estudiante","micasa2");
        saludos.add(saludo);
        saludos.add(saludo2);

        return saludos;
    }


}