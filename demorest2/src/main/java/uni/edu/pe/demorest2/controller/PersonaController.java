package uni.edu.pe.demorest2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.demorest2.dto.Persona;
import uni.edu.pe.demorest2.service.PersonaService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService service;
 /*   @RequestMapping(value="/personacondatos",method = RequestMethod.GET)
    public String datospersona(){
        Persona p2 = new Persona("damian","camones",54);
        return p2.getApellido()+" "+p2.getNombre();
    }
    @RequestMapping(value="/personacondatos2",method = RequestMethod.GET)
    public void asd(){
        Persona p1 = new Persona("damian","camones",54);
        System.out.println(p1.nombrecompleto());
    }*/
 @RequestMapping(value="/personacondatos2",method = RequestMethod.GET)
 public Persona personaunica(){
     Persona p1 = new Persona("damian","camones",54);
     return p1;
     //no necesita to string
 }

    @RequestMapping(value="/personacondatos3",method = RequestMethod.GET)
    public List<Persona> listadatos(){
        return service.listadatos();
    }//corre
    @RequestMapping(value="/personacondatos4",method = RequestMethod.POST)
    public List<Persona> listadatoscomplejointerno(){
     return service.listadatos();
    }//no corre porque no esta en postman
}
