package uni.edu.pe.demo3restbasedatos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.demo3restbasedatos.dao.AlumnoDao;
import uni.edu.pe.demo3restbasedatos.dto.Alumno;

import java.util.List;

@Service
public class AlumnoServiceImpl implements  AlumnoService{

    @Autowired// inyectame el alumno dao: "bainding"
    private AlumnoDao alumnoDao;


    @Override
    public List<Alumno> consultarRegistros() {
        return alumnoDao.consultarRegistros();
    }
}
