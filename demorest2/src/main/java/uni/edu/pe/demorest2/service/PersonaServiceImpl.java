package uni.edu.pe.demorest2.service;

import org.springframework.stereotype.Service;
import uni.edu.pe.demorest2.dto.Persona;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonaServiceImpl implements PersonaService{

    public List<Persona> listadatoscomplejointerno(){
        Persona p1 = new Persona("damian","camones",54);
        Persona p2 = new Persona("andromeda","gargamela",46);
        List<Persona> lista1 = new ArrayList<>();
        lista1.add(p1);
        lista1.add(p2);
        //solo se puede por postman
        // no te deja por browser
        return lista1;
    }
    public Persona personaunica(){
        Persona p1 = new Persona("damian","camones",54);
        return p1;
        //no necesita to string
    }

    @Override
    public List<Persona> listadatos() {
            List<Persona> listadatos=new ArrayList<>();
            Persona p1 = new Persona("damian","camones",54);
            Persona p2 = new Persona("andromeda","gargamela",46);
            List<Persona> lista1 = new ArrayList<>();
            lista1.add(p1);
            lista1.add(p2);

            return lista1;

    }
}
