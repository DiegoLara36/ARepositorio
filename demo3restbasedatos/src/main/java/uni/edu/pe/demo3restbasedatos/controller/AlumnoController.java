package uni.edu.pe.demo3restbasedatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.demo3restbasedatos.dto.Alumno;
import uni.edu.pe.demo3restbasedatos.service.AlumnoService;

import java.util.List;

@RestController
public class AlumnoController{
    @Autowired // para vindear??: inyecte el tiempo de ejecucion
    private AlumnoService service;
   @RequestMapping(value="/consultarRegistros",method = RequestMethod.GET)
    public List<Alumno> consultarRegistros(){
        return service.consultarRegistros();
    }

}
