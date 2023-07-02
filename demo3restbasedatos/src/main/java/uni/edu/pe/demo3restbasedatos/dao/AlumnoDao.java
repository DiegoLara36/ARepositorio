package uni.edu.pe.demo3restbasedatos.dao;

import uni.edu.pe.demo3restbasedatos.dto.Alumno;

import java.util.List;

public interface AlumnoDao {
    List<Alumno> consultarRegistros();
}
